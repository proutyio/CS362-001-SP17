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
        	assertEquals(hs.size(),4); //wrong should be 3 but i introduced subtle bug
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
            hs.add("string");
            hs.add(10);
            
            assertTrue(hs.contains(10));
            assertTrue(hs.contains("string"));//testing bug I introducded
                                              //did not catch it!
      	} catch(Exception e) {}

    }

    @Test
    public void test5() throws Throwable {
    	MyHashSet hs = new MyHashSet(20); //using overloaded contructor
    	 try {
            assertTrue(hs.isEmpty());
            assertFalse(hs.size() == 20); //checking subtle bugs in different way
                                          //should return true but bug is uncaught so is false
            hs.add(10);
            //assertTrue(hs.clone().size() == 21); //checking bug when cloned
      	} catch(Exception e) {}

    }

}
