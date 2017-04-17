import org.junit.Test; 
import static org.junit.Assert.*; 
import java.util.EmptyStackException;


public class TestHashSet {

    @Test
    public void test1() throws Throwable {
        MyHashSet mhs = new MyHashSet();

        mhs.add(10);
        mhs.add("String");

        assert mhs.contains(10);
        assert mhs.contains("Stri");
    }

}
