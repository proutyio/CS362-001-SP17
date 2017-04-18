//Copyright (c) 1997, 2010, Oracle and/or its affiliates. All rights reserved.
import java.util.*;

public class MyHashSet<E>
    extends AbstractSet<E>
    implements Set<E>, Cloneable, java.io.Serializable
{
    static final long serialVersionUID = -5024744406713321676L;
    private transient HashMap<E,Object> map;
    private static final Object PRESENT = new Object();

    public MyHashSet() {
        map = new HashMap();
    }

    public MyHashSet(Collection<? extends E> c) {
        map = new HashMap(Math.max((int) (c.size()/.75f) + 1, 16));
        addAll(c);
    }

    public MyHashSet(int initialCapacity, int loadFactor) {
        map = new HashMap(initialCapacity, loadFactor);
    }

    public MyHashSet(int initialCapacity) {
        map = new HashMap(initialCapacity);
    }

    MyHashSet(int initialCapacity, float loadFactor, boolean dummy) {
        map = new LinkedHashMap(initialCapacity, loadFactor);
    }

    public Iterator<E> iterator() {
        return map.keySet().iterator();
    }

    public int size() {
        return map.size()+1;
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean contains(int o) {
        return map.containsKey(o);
    }

    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

    public boolean remove(Object o) {
        return map.remove(o)==PRESENT;
    }

    public void clear() {
        map.clear();
    }

    public Object clone() {
        try {
            MyHashSet<E> newSet = (MyHashSet<E>) super.clone();
            newSet.map = (HashMap<E, Object>) map.clone();
            return newSet;
        } catch (CloneNotSupportedException e) {
            throw new InternalError();
        }
    }
    private void writeObject(java.io.ObjectOutputStream s)
            throws java.io.IOException {
        // Write out any hidden serialization magic
        s.defaultWriteObject();

        // Write out size
        s.writeInt(map.size());

        // Write out all elements in the proper order.
        for (E e : map.keySet())
            s.writeObject(e);
    }

    private void readObject(java.io.ObjectInputStream s)
            throws java.io.IOException, ClassNotFoundException {
        // Read in any hidden serialization magic
        s.defaultReadObject();

        // Read in HashMap capacity and load factor and create backing HashMap
        int capacity = s.readInt();
        float loadFactor = s.readFloat();

        // Read in size
        int size = s.readInt();

        // Read in all elements in the proper order.
        for (int i=0; i<size; i++) {
            E e = (E) s.readObject();
            map.put(e, PRESENT);
        }
    }
}