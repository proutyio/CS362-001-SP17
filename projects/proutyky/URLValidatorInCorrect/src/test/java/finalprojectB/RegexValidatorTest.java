package finalprojectB;

import org.junit.Test;
import static org.junit.Assert.*;
import finalprojectB.RegexValidator;
import java.util.regex.PatternSyntaxException;
import org.junit.runner.RunWith;

public class RegexValidatorTest {

  @Test(timeout = 4000)
  public void test()  throws Throwable  {
      String string = "t(e)st";
      RegexValidator regexValidator = new RegexValidator(string, false);
      assertNotNull(regexValidator.validate("test"));

      string = "(t)(e)(s)(t)";
      regexValidator = new RegexValidator(string, false);
      assertNotNull(regexValidator.validate("test"));

      string = "(t)(e)(s)t";
      regexValidator = new RegexValidator(string, false);
      assertNotNull(regexValidator.validate("test"));
  }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "] is missing";
      stringArray0[1] = "] is missing";
      stringArray0[2] = "Regular expressions are missing";
      stringArray0[3] = "] is missing";
      stringArray0[4] = "rZ#R`s_Qb&";
      RegexValidator regexValidator0 = new RegexValidator(stringArray0, true);
      String[] stringArray1 = regexValidator0.match("Regular expressions are missing");
      assertNotSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "RegexValidator{] is missing}";
      RegexValidator regexValidator0 = null;
      try {
        regexValidator0 = new RegexValidator(stringArray0);
        fail("Expecting exception: PatternSyntaxException");
      } catch(PatternSyntaxException e) {}
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegexValidator regexValidator0 = null;
      try {
        regexValidator0 = new RegexValidator("_gf`ZR{", true);
        fail("Expecting exception: PatternSyntaxException");
      } catch(PatternSyntaxException e) {}
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegexValidator regexValidator0 = null;
      try {
        regexValidator0 = new RegexValidator((String) null, false);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {}
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegexValidator regexValidator0 = null;
      try {
        regexValidator0 = new RegexValidator("(@LovHW5");
        fail("Expecting exception: PatternSyntaxException");
      } catch(PatternSyntaxException e) {}
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RegexValidator regexValidator0 = null;
      try {
        regexValidator0 = new RegexValidator("");
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {}
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      String[] stringArray0 = new String[5];
      RegexValidator regexValidator0 = null;
      try {
        regexValidator0 = new RegexValidator(stringArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {}
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      String[] stringArray0 = new String[0];
      RegexValidator regexValidator0 = null;
      try {
        regexValidator0 = new RegexValidator(stringArray0, true);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {}
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "N5!,AfMLrw^";
      stringArray0[1] = "28";
      RegexValidator regexValidator0 = new RegexValidator(stringArray0);
      String string0 = regexValidator0.toString();
      assertEquals("RegexValidator{N5!,AfMLrw^,28}", string0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("t<\"sG");
      String string0 = regexValidator0.validate("");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("t<\"sG");
      String string0 = regexValidator0.validate((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "N5!,AfMLrw^";
      stringArray0[1] = "28";
      RegexValidator regexValidator0 = new RegexValidator(stringArray0);
      String string0 = regexValidator0.validate("28");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "N5!,AfMLrw^";
      stringArray0[1] = "28";
      RegexValidator regexValidator0 = new RegexValidator(stringArray0);
      String[] stringArray1 = regexValidator0.match("");
      assertNull(stringArray1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("t<\"sG");
      String[] stringArray0 = regexValidator0.match((String) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("t<\"sG");
      boolean boolean0 = regexValidator0.isValid("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("t<\"sG");
      boolean boolean0 = regexValidator0.isValid((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "57!D";
      stringArray0[1] = "N5!,AfMLrw^";
      RegexValidator regexValidator0 = new RegexValidator(stringArray0, false);
      boolean boolean0 = regexValidator0.isValid("N5!,AfMLrw^");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      RegexValidator regexValidator0 = null;
      try {
        regexValidator0 = new RegexValidator(stringArray0, false);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {}
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("k:!B", false);
      String[] stringArray0 = regexValidator0.match("k:!B");
      RegexValidator regexValidator1 = null;
      try {
        regexValidator1 = new RegexValidator(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {}
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RegexValidator regexValidator0 = null;
      try {
        regexValidator0 = new RegexValidator((String[]) null, true);
        fail("Expecting exception: IllegalArgumentException");
      } catch(IllegalArgumentException e) {}
  }
}
