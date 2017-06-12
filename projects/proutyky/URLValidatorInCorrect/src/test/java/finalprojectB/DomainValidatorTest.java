package finalprojectB;

import org.junit.Test;
import static org.junit.Assert.*;
import finalprojectB.DomainValidator;

import org.junit.runner.RunWith;

public class DomainValidatorTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      try { 
        domainValidator0.isValidTld((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {}
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      try { 
        domainValidator0.isValidLocalTld((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {}
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(false);
      try { 
        domainValidator0.isValidInfrastructureTld((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {}
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      try { 
        domainValidator0.isValidGenericTld((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {}
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      try { 
        domainValidator0.isValidCountryCodeTld((String) null);
        fail("Expecting exception: NullPointerException");
      } catch(NullPointerException e) {}
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidLocalTld("localhost");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidLocalTld("root");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidCountryCodeTld("cc");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidCountryCodeTld("root");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidGenericTld("com");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidGenericTld(" j4WJvWZFO^men*");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidInfrastructureTld("root");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidInfrastructureTld("x1{h,ZO");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidTld(".cc");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidTld("edu");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValidTld("root");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValidTld("localhost");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValidTld("BhCL.7Op");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValid("G9>`vGCC");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(true);
      boolean boolean0 = domainValidator0.isValid("hn");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance(false);
      boolean boolean0 = domainValidator0.isValid("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DomainValidator domainValidator0 = DomainValidator.getInstance();
      boolean boolean0 = domainValidator0.isValid("finalprojecB.RgexValidator");
      assertFalse(boolean0);
  }
}
