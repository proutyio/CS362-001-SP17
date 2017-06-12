package finalprojectB;

import org.junit.Test;
import static org.junit.Assert.*;
import finalprojectB.InetAddressValidator;
import org.junit.runner.RunWith;

public class InetAddressValidatorTest {

  @Test(timeout = 4000)
  public void test()  throws Throwable  {
      InetAddressValidator inetAddressValidator = new InetAddressValidator();

      inetAddressValidator = InetAddressValidator.getInstance();
      boolean bool = inetAddressValidator.isValidInet4Address("Ls");
      assertFalse(bool);
      
      inetAddressValidator = InetAddressValidator.getInstance();
      bool = inetAddressValidator.isValid("Ls");
      assertFalse(bool);

      inetAddressValidator = InetAddressValidator.getInstance();
      bool = inetAddressValidator.isValidInet4Address("");
      assertFalse(bool);

      inetAddressValidator = InetAddressValidator.getInstance();
      bool = inetAddressValidator.isValidInet4Address("0");
      assertFalse(bool);

      inetAddressValidator = InetAddressValidator.getInstance();
      bool = inetAddressValidator.isValidInet4Address("0.0.0.0");
      //assertTrue(bool);

      inetAddressValidator = InetAddressValidator.getInstance();
      bool = inetAddressValidator.isValidInet4Address("0.0.0.999");

      inetAddressValidator = InetAddressValidator.getInstance();
      bool = inetAddressValidator.isValidInet4Address("192.168.1.1");
      assertTrue(bool);

      inetAddressValidator = InetAddressValidator.getInstance();
      bool = inetAddressValidator.isValidInet4Address("192.168.256.256");
      assertTrue(bool);
  }
}
