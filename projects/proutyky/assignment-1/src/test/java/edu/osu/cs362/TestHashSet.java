import org.junit.Test; 
import static org.junit.Assert.*; 
import java.util.EmptyStackException;


public class TestHashSet {

    @Test
    public void test0() throws Throwable {
        MyHashSet hs = new MyHashSet();

        hs.add(10);
        hs.add(11);
        hs.add(20);

        try{
        	assertEquals(hs.size(),3);
        }catch(Exception e){}
    }

    @Test
    public void test1() throws Throwable {
   		MyHashSet hs = new MyHashSet();
    	 try {
    	 	hs.add("string");
    	 	assertFalse(hs.isEmpty());
      	} catch(Exception e) {}
    }

    @Test
    public void test2() throws Throwable {
    	MyHashSet hs = new MyHashSet();
    	 try {
    	 	hs.add(20);
    	 	hs.add("ok");
    	 	hs.add(100);

    	 	assertTrue(hs.contains("ok"));
      	} catch(Exception e) {}

    }

    @Test
    public void test3() throws Throwable {
    	//insantiating hashset with loadfactor as an int not a double
    	 try {
        	MyHashSet hs = new MyHashSet(10,20);
      	} catch(Exception e) {}

    }

    @Test
    public void test4() throws Throwable {
    	MyHashSet hs = new MyHashSet();
    	 try {
        	
      	} catch(Exception e) {}

    }

    @Test
    public void test5() throws Throwable {
    	MyHashSet hs = new MyHashSet();
    	 try {
        	
      	} catch(Exception e) {}

    }

}
