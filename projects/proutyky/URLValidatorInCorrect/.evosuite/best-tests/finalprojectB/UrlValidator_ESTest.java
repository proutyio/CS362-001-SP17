/*
 * This file was automatically generated by EvoSuite
 * Thu Jun 08 16:08:10 GMT 2017
 */

package finalprojectB;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import finalprojectB.RegexValidator;
import finalprojectB.UrlValidator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UrlValidator_ESTest extends UrlValidator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[14];
      stringArray0[0] = "N(R_9J6<TN";
      stringArray0[1] = "<B0QD$r";
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, (-780L));
      // Undeclared exception!
      try { 
        urlValidator0.isValidScheme("eu");
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "ee";
      stringArray0[1] = "~YtV\"<;zB~xKvU>";
      stringArray0[2] = "arpa";
      stringArray0[3] = "localdomain";
      stringArray0[4] = "I&3!R2@O -";
      stringArray0[5] = "finalprojectB.UrlValidator";
      RegexValidator regexValidator0 = new RegexValidator(stringArray0);
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, regexValidator0, 1311L);
      urlValidator0.isValidFragment("");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UrlValidator urlValidator0 = UrlValidator.getInstance();
      urlValidator0.countToken("d|abgA)c<mW/iud)", "d|abgA)c<mW/iud)");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, 8L);
      urlValidator0.isValidQuery((String) null);
      // Undeclared exception!
      try { 
        urlValidator0.countToken((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("finalprojectB.UrlValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
      urlValidator0.isValid((String) null);
      urlValidator0.isValidFragment((String) null);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UrlValidator urlValidator0 = UrlValidator.getInstance();
      urlValidator0.isValidPath("c0R%SKK!;:Vc-");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
      urlValidator0.isValidQuery((String) null);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[11];
      stringArray0[0] = "ao";
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      // Undeclared exception!
      try { 
        urlValidator0.isValidScheme("gi");
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "aqfRf,K7K%Y6!*";
      stringArray0[1] = "ag";
      RegexValidator regexValidator0 = new RegexValidator(stringArray0);
      UrlValidator urlValidator0 = new UrlValidator(stringArray0, regexValidator0, (-285L));
      urlValidator0.countToken("aqfRf,K7K%Y6!*", "");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RegexValidator regexValidator0 = new RegexValidator("ca");
      UrlValidator urlValidator0 = new UrlValidator((String[]) null, regexValidator0, 0L);
      urlValidator0.isValidAuthority("ca");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator(0L);
      urlValidator0.isValid((String) null);
      urlValidator0.isValidFragment((String) null);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      UrlValidator urlValidator0 = UrlValidator.getInstance();
      UrlValidator urlValidator1 = new UrlValidator();
      urlValidator0.isValidScheme("bt");
      urlValidator0.countToken("eX&vrZ/I3", "org");
      UrlValidator.getInstance();
      // Undeclared exception!
      try { 
        urlValidator0.isValid("eX&vrZ/I3");
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         assertThrownBy("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = "at";
      RegexValidator regexValidator0 = new RegexValidator("at", false);
      regexValidator0.match("at");
      regexValidator0.validate("at");
      regexValidator0.toString();
      UrlValidator urlValidator0 = new UrlValidator(regexValidator0, 3508L);
      urlValidator0.isValidPath("http");
      urlValidator0.isValidPath("");
      urlValidator0.isValidAuthority("at");
      urlValidator0.isValidQuery("ZQCtfEpeWR");
      urlValidator0.isValidPath("an");
      // Undeclared exception!
      try { 
        urlValidator0.isValid("ar");
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         assertThrownBy("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator();
      urlValidator0.isValid("");
      urlValidator0.isValidPath("");
      urlValidator0.isValidQuery("");
      UrlValidator urlValidator1 = new UrlValidator();
      urlValidator0.isValidScheme("MV;(hA");
      UrlValidator.getInstance();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      long long0 = (-3041L);
      UrlValidator urlValidator0 = new UrlValidator((-3041L));
      String string0 = "https";
      urlValidator0.isValidScheme("https");
      String string1 = "";
      urlValidator0.isValid("");
      String string2 = null;
      urlValidator0.isValid((String) null);
      urlValidator0.isValidPath("https");
      String string3 = "";
      urlValidator0.isValidPath("");
      urlValidator0.isValidScheme("");
      // Undeclared exception!
      try { 
        urlValidator0.countToken("", "");
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[8];
      String string0 = ",";
      stringArray0[0] = ",";
      UrlValidator urlValidator0 = new UrlValidator(stringArray0);
      urlValidator0.isValidScheme("3hc3@");
      urlValidator0.isValidPath(",");
      urlValidator0.isValidQuery((String) null);
      // Undeclared exception!
      try { 
        urlValidator0.isValid(",");
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         assertThrownBy("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((-1995L));
      UrlValidator urlValidator1 = new UrlValidator((String[]) null);
      UrlValidator urlValidator2 = new UrlValidator((String[]) null);
      urlValidator1.isValidQuery("QwKbne%YK");
      urlValidator1.isValidFragment("rwG7iA.Z?.wqzWXz");
      RegexValidator regexValidator0 = new RegexValidator("rwG7iA.Z?.wqzWXz", false);
      UrlValidator urlValidator3 = new UrlValidator(regexValidator0, (-1094L));
      UrlValidator urlValidator4 = new UrlValidator((-1094L));
      // Undeclared exception!
      try { 
        urlValidator0.isValidAuthority("");
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         assertThrownBy("java.util.regex.Matcher", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String string0 = "ss'%P Nz+H_C,nm&zi";
      String string1 = "";
      UrlValidator.getInstance();
      RegexValidator regexValidator0 = null;
      try {
        regexValidator0 = new RegexValidator("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Regular expression[0] is missing
         //
         assertThrownBy("finalprojectB.RegexValidator", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UrlValidator urlValidator0 = new UrlValidator((-1306L));
      urlValidator0.isValidPath((String) null);
      urlValidator0.isValidScheme((String) null);
      urlValidator0.isValidPath((String) null);
      urlValidator0.isValidScheme("http");
      String string0 = null;
      urlValidator0.isValidAuthority((String) null);
      urlValidator0.isValidPath("^p{ASCII}+$");
      urlValidator0.isValidQuery("x+Tv+5OOs~AaOArg");
      String[] stringArray0 = new String[9];
      stringArray0[2] = null;
      stringArray0[4] = "^p{ASCII}+$";
      stringArray0[5] = "ID!7,n";
      stringArray0[6] = "x+Tv+5OOs~AaOArg";
      stringArray0[7] = null;
      stringArray0[1] = null;
      RegexValidator regexValidator0 = new RegexValidator("x+Tv+5OOs~AaOArg");
      regexValidator0.toString();
      regexValidator0.toString();
      UrlValidator urlValidator1 = new UrlValidator(stringArray0, regexValidator0, 62L);
      // Undeclared exception!
      try { 
        urlValidator1.isValidAuthority("file");
       //  fail("Expecting exception: IllegalStateException");
       // Unstable assertion
      } catch(IllegalStateException e) {
         //
         // No match found
         //
         assertThrownBy("java.util.regex.Matcher", e);
      }
  }
}
