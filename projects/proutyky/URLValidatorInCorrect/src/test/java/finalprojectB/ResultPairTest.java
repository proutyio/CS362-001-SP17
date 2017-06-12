package finalprojectB;

import org.junit.Test;
import static org.junit.Assert.*;
import finalprojectB.ResultPair;
import org.junit.runner.RunWith;

public class ResultPairTest {

  @Test(timeout = 4000)
  public void test()  throws Throwable  {
      ResultPair resultPair0 = new ResultPair("", true);
      assertTrue(resultPair0.valid);
  }
}
