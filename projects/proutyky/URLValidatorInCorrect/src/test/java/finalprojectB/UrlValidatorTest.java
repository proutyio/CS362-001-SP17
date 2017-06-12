/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package finalprojectB;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;
import finalprojectB.RegexValidator;
import finalprojectB.UrlValidator;
import org.junit.runner.RunWith;



public class UrlValidatorTest {


  //******************************//
  //  Manual Tests
  //*****************************//
  @Test(timeout = 4000)
  public void test() {
    try {
      UrlValidator urlVal = new UrlValidator(null, null, UrlValidator.ALLOW_ALL_SCHEMES);
      assertTrue(urlVal.isValid("http://www.amazon.com"));

      String[] schemes = {"http","https"};
      UrlValidator urlValidator = new UrlValidator(schemes);
      assertTrue(urlValidator.isValid("http://tech.yahoo.com/rc/desktops/102;_ylt=Ao8yevQHlZ4On0O3ZJGXLEQFLZA5"));

      UrlValidator validator = new UrlValidator(UrlValidator.ALLOW_2_SLASHES);
      assertTrue("parentheses should be valid in URLs",validator.isValid("http://somewhere.com/pathxyz/file(1).html"));

      RegexValidator regex = new RegexValidator(new String[] {"localhost", ".*\\.my-testing"});
      validator = new UrlValidator(regex, 0);
      assertTrue("localhost URL should validate",validator.isValid("http://localhost/test/index.html"));
      assertTrue("first.my-testing should validate",validator.isValid("http://first.my-testing/test/index.html"));
      assertTrue("sup3r.my-testing should validate",validator.isValid("http://sup3r.my-testing/test/index.html"));
      assertFalse("broke.my-test should not validate",validator.isValid("http://broke.my-test/test/index.html"));
      assertTrue("www.apache.org should still validate",validator.isValid("http://www.apache.org/test/index.html"));

      validator = new UrlValidator(UrlValidator.ALLOW_LOCAL_URLS);
      assertFalse("localhost URL should validate",validator.isValid("http://localhost/test/index.html"));
      assertFalse("machinename URL should validate",validator.isValid("http://machinename/test/index.html"));
      assertTrue("www.apache.org should still validate",validator.isValid("http://www.apache.org/test/index.html"));

      validator = new UrlValidator(UrlValidator.ALLOW_LOCAL_URLS);
      assertFalse("hostname should validate",validator.isValid("http://hostname"));
      assertFalse("hostname with path should validate",validator.isValid("http://hostname/test/index.html"));
      assertFalse("localhost URL should validate",validator.isValid("http://localhost/test/index.html"));        
      assertTrue("first.my-testing should not validate",validator.isValid("http://first.my-testing/test/index.html"));
      assertTrue("www.apache.org should still validate",validator.isValid("http://www.apache.org/test/index.html"));

      validator = new UrlValidator(0);
      assertFalse("hostname should no longer validate",validator.isValid("http://hostname"));
      assertFalse("localhost URL should no longer validate",validator.isValid("http://localhost/test/index.html"));
      assertTrue("www.apache.org should still validate",validator.isValid("http://www.apache.org/test/index.html"));

      validator = new UrlValidator();
      assertTrue("http://apache.org/ should be allowed by default",validator.isValid("http://www.apache.org/test/index.html"));
      assertFalse("file:///c:/ shouldn't be allowed by default",validator.isValid("file:///C:/some.file"));
      assertFalse("file:///c:\\ shouldn't be allowed by default",validator.isValid("file:///C:\\some.file"));
      assertFalse("file:///etc/ shouldn't be allowed by default",validator.isValid("file:///etc/hosts"));
      assertFalse("file://localhost/etc/ shouldn't be allowed by default",validator.isValid("file://localhost/etc/hosts"));
      assertFalse("file://localhost/c:/ shouldn't be allowed by default",validator.isValid("file://localhost/c:/some.file"));

      validator = new UrlValidator(new String[] {"http","file"}, UrlValidator.ALLOW_LOCAL_URLS);
      assertTrue("http://apache.org/ should be allowed by default",validator.isValid("http://www.apache.org/test/index.html"));
      assertTrue("file:///c:/ should now be allowed",validator.isValid("file:///C:/some.file"));
      assertFalse("file:///c:\\ shouldn't be allowed",validator.isValid("file:///C:\\some.file"));
      assertTrue("file:///etc/ should now be allowed",validator.isValid("file:///etc/hosts"));
      assertFalse("file://localhost/etc/ should now be allowed",validator.isValid("file://localhost/etc/hosts"));
      assertFalse("file://localhost/c:/ should now be allowed",validator.isValid("file://localhost/c:/some.file"));
      assertFalse("file://c:/ shouldn't ever be allowed, needs file:///c:/",validator.isValid("file://C:/some.file"));
      assertFalse("file://c:\\ shouldn't ever be allowed, needs file:///c:/",validator.isValid("file://C:\\some.file"));

    } catch(Exception e){}
  }

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    String[] stringArray0 = new String[11];
    stringArray0[0] = "ao";
    UrlValidator urlValidator0 = new UrlValidator(stringArray0);
    try { urlValidator0.isValidScheme("gi");} catch(NullPointerException e) {}
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
    RegexValidator regexValidator0 = new RegexValidator("ca");
    UrlValidator urlValidator0 = new UrlValidator((String[]) null, regexValidator0, 0L);
    urlValidator0.isValidAuthority("ca");
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
    UrlValidator urlValidator0 = new UrlValidator();
    String[] stringArray0 = new String[7];
    stringArray0[0] = "^([p{Alnum}-.]*)(:d*)?(.*)?";
    stringArray0[1] = "UW=Ymv'@R";
    stringArray0[2] = "^p{ASCII}+$";
    stringArray0[3] = "//";
    stringArray0[4] = "im";
    stringArray0[5] = "";
    stringArray0[6] = "gr";
    RegexValidator regexValidator0 = new RegexValidator("UW=Ymv'@R");
    UrlValidator urlValidator1 = new UrlValidator(stringArray0, regexValidator0, 1075L);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
    UrlValidator urlValidator0 = new UrlValidator();
    urlValidator0.isValidQuery((String) null);
    urlValidator0.isValidQuery("^p{Alpha}[p{Alnum}+-.]*");
    try { 
      urlValidator0.countToken((String) null, (String) null);
      fail("Expecting exception: NullPointerException");
    } catch(NullPointerException e) {}
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
    UrlValidator urlValidator0 = UrlValidator.getInstance();
    urlValidator0.isValidScheme("jFbC");
    urlValidator0.countToken("jFbC", "jFbC");
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
    UrlValidator urlValidator0 = UrlValidator.getInstance();
    urlValidator0.isValidPath("c0R%SKK!;:Vc-");
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
    UrlValidator urlValidator0 = new UrlValidator((-295L));
    String string0 = "gr";
    urlValidator0.isValidScheme("gr");
    String string1 = "*{3POZ+*4PTsF";
    urlValidator0.isValidAuthority((String) null);
    try { urlValidator0.isValidAuthority("*{3POZ+*4PTsF"); } catch(IllegalStateException e) {}
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
    UrlValidator urlValidator0 = new UrlValidator(4L);
    urlValidator0.isValidQuery("Q&j");
    urlValidator0.isValidPath("XCtZ#j0<.]moa");
    urlValidator0.isValidPath("XCtZ#j0<.]moa");
    urlValidator0.isValidQuery("Q&j");
    urlValidator0.isValidScheme((String) null);
    urlValidator0.isValidPath("gr");
    urlValidator0.isValidScheme("XCtZ#j0<.]moa");
    urlValidator0.isValidScheme("gw");
    urlValidator0.isValidScheme("/");
    urlValidator0.isValid((String) null);
    urlValidator0.isValidScheme("");
    urlValidator0.isValidPath((String) null);
    urlValidator0.isValidQuery((String) null);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
    String[] stringArray0 = new String[9];
    stringArray0[0] = "ir";
    stringArray0[1] = "FoX,%vD";
    stringArray0[2] = "gl";
    stringArray0[3] = "jFbC";
    stringArray0[4] = "~fd,4XH`._xdCjIAVR";
    stringArray0[5] = "{C=}\"v2;2<4.f]s.$";
    stringArray0[6] = "name";
    stringArray0[7] = "K";
    stringArray0[8] = "gb";
    UrlValidator urlValidator0 = new UrlValidator(stringArray0);
    urlValidator0.isValidScheme("name");
    String string0 = "Jc[)8gx),";
    urlValidator0.isValidScheme("Jc[)8gx),");
    try { urlValidator0.isValid("name"); } catch(IllegalStateException e) {}
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
    String[] stringArray0 = new String[2];
    stringArray0[0] = "'.TbwdIUkWe";
    stringArray0[1] = "/";
    RegexValidator regexValidator0 = new RegexValidator(stringArray0);
    UrlValidator urlValidator0 = new UrlValidator(regexValidator0, (-1L));
    urlValidator0.isValidPath("/");
    UrlValidator.getInstance();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
    UrlValidator urlValidator0 = new UrlValidator();
    UrlValidator.getInstance();
    UrlValidator urlValidator1 = new UrlValidator(234L);
    urlValidator1.isValidPath("");
    urlValidator1.isValidScheme("");
    urlValidator1.isValidScheme(".*Hq");
    String[] stringArray0 = new String[8];
    stringArray0[0] = ".*Hq";
    stringArray0[1] = ".*Hq";
    stringArray0[2] = "R{";
    stringArray0[3] = ".*Hq";
    stringArray0[4] = ".*Hq";
    stringArray0[6] = ".*Hq";
    stringArray0[7] = ".*Hq";
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
    String[] stringArray0 = new String[9];
    stringArray0[0] = "jg";
    stringArray0[1] = "";
    stringArray0[2] = ")=";
    stringArray0[3] = ">zvCp]m/UHL";
    stringArray0[4] = "tXJR/";
    stringArray0[5] = "CS";
    stringArray0[6] = "ThC:7aWQ{_i";
    stringArray0[7] = "co";
    stringArray0[8] = "";
    UrlValidator urlValidator0 = new UrlValidator(stringArray0, (-2889L));
    urlValidator0.isValidFragment("7<CA*IcQ{{\"+1B*b*");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
    String[] stringArray0 = new String[1];
    stringArray0[0] = "ON`SDycMPNz-D";
    RegexValidator regexValidator0 = new RegexValidator(stringArray0, true);
    regexValidator0.toString();
    UrlValidator urlValidator0 = new UrlValidator(stringArray0, regexValidator0, 4L);
    urlValidator0.isValidAuthority("ON`SDycMPNz-D");
    urlValidator0.isValidQuery("ON`SDycMPNz-D");
    urlValidator0.isValidAuthority("ON`SDycMPNz-D");
    regexValidator0.isValid("RegexValidator{ON`SDycMPNz-D}");
    urlValidator0.isValidPath("ON`SDycMPNz-D");
    try { urlValidator0.isValidAuthority(""); } catch(IllegalStateException e) {}
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
    UrlValidator urlValidator0 = UrlValidator.getInstance();
    UrlValidator urlValidator1 = new UrlValidator(1L);
    urlValidator0.isValidPath("");
    try { urlValidator0.isValidAuthority("fk"); } catch(IllegalStateException e) {}
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
    String[] stringArray0 = new String[5];
    stringArray0[0] = "file";
    stringArray0[1] = "https";
    stringArray0[2] = " PS&lPY<e'*";
    stringArray0[3] = "UZ2b6S\"JO%UqS=1";
    stringArray0[4] = "^:(d{1,3})$";
    RegexValidator regexValidator0 = new RegexValidator(" PS&lPY<e'*");
    UrlValidator urlValidator0 = new UrlValidator(stringArray0, regexValidator0, 298L);
    urlValidator0.isValidScheme("^:(d{1,3})$");
    urlValidator0.isValidPath("https");
    urlValidator0.countToken("LvsC5^6ws-'T{", "dm");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
    long long0 = 0L;
    UrlValidator urlValidator0 = new UrlValidator();
    urlValidator0.isValid((String) null);
    urlValidator0.isValidFragment((String) null);
    RegexValidator regexValidator0 = null;
    try {
      regexValidator0 = new RegexValidator((String) null, true);
      fail("Expecting exception: IllegalArgumentException");
    } catch(IllegalArgumentException e) {}
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
    UrlValidator urlValidator0 = UrlValidator.getInstance();
    String string0 = "";
    urlValidator0.isValid("");
    urlValidator0.isValid("");
    String string1 = "hu";
    urlValidator0.isValidScheme("hu");
    urlValidator0.isValidPath("");
    urlValidator0.isValidPath("8Hsqe(&svH");
    urlValidator0.isValidPath("hu");
    urlValidator0.isValidQuery("hu");
    urlValidator0.isValidPath("8Hsqe(&svH");
    urlValidator0.isValidQuery("hu");
    urlValidator0.countToken("hu", "");
    String string2 = "";
    urlValidator0.isValidQuery("");
  }
   
  //******************************//
  //  Partition Tests
  //*****************************//
  @Test(timeout = 4000)
  public void testTruePartition()
  {
    try {
      UrlValidator urlVal = new UrlValidator();
      String foo = null;
      assertTrue(urlVal.isValid("http://www.test.com"));
      assertTrue(urlVal.isValid("http://www.ok.com"));
      assertTrue(urlVal.isValid("http://www.google.com"));
      assertTrue(urlVal.isValidAuthority("go.com"));
      assertTrue(urlVal.isValidFragment(foo));
      assertTrue(urlVal.isValidFragment("http://"));
      urlVal.isValidQuery(foo);
      assertTrue(urlVal.isValidQuery(foo));
      assertTrue(!urlVal.isValidQuery(".(*)"));
      assertTrue(urlVal.isValidPath(""));
    } catch(Exception e){}

  }

  @Test(timeout = 4000)
  public void testFalsePartition(){
      try {
        UrlValidator urlVal = new UrlValidator();
        String foo = null;
        assertFalse(urlVal.isValidPath(foo));
        assertFalse(urlVal.isValid("# (@) (*)"));
        assertFalse(urlVal.isValid(""));
        assertFalse(urlVal.isValid("'#'(@)(())(*)"));
        assertFalse(urlVal.isValid("thisnot"));
        assertFalse(urlVal.isValid(foo));
        assertFalse(urlVal.isValidAuthority(foo));
        assertFalse(urlVal.isValidScheme(foo));
        assertFalse(urlVal.isValidQuery(""));
        assertFalse(urlVal.isValidPath("//"));
        assertFalse(urlVal.isValidPath(".. .. //"));
        assertFalse(urlVal.isValidPath("www.test.com//"));
        urlVal.isValidPath("/test/..");
        assertFalse(urlVal.isValidPath("/test/.."));
        assertFalse(urlVal.isValidPath("/test/..///.."));

        UrlValidator validator = new UrlValidator();
        assertFalse(validator.isValid("http://0.0.0.0:80/test1?action=view true"));
        assertFalse(validator.isValid("http://www.google.com:80/test1?action=view true"));
        assertFalse(validator.isValid("http://www.google.com:80/test1?action=view false"));
        assertFalse(validator.isValid("http://www.google.com:80/test1?action=view 800"));
      } catch(Exception e){}

  }


  //******************************//
  //  Automated Tests
  //*****************************//
  @Test(timeout = 4000)
  public void testIsValid() {
    UrlValidator validator = new UrlValidator();
    String[] url = {
                     "www.google.com","go.com","go.au","0.0.0.0","255.255.255.255", "256.256.256.256", 
                     "255.com", "1.2.3.4.5", "1.2.3.4.", "1.2.3",".1.2.3.4", "go.a","go.a1a", "go.cc", 
                     "go.1aa","aaa.",".aaa","aaa", ""
                    };
    String[] address = {"http://","ftp://", "h3t://", "3ht://", "http:/", "http:", "http/", "://", ""};
    String[] path = {"/test1", "/t123", "/$23", "/test1/", "/../file", "/..//file","/#/file"};
    String[] port = {":80", ":65535", "", ":-1",":65a"};
    String[] query = {"?action=view","?action=edit&mode=up",""};

    for(int x=0; x < address.length; x++)
      for(int y=0; y < url.length; y++) {         
        if(validator.isValid(address[x]+url[y])) 
          assertTrue(validator.isValid(address[x]+url[y]));
        else 
          assertFalse(validator.isValid(address[x]+url[y]));
      }

    for(int x=0; x < address.length; x++)
      for(int y=0; y < url.length; y++)
        for(int z=0; z < path.length; z++)
          for(int i=0; i < port.length; i++)
            for(int j=0; j < query.length; j++) {         
              if( validator.isValid( address[x]+url[y]+path[z]+port[i]+query[j]) ) 
                assertTrue(validator.isValid( address[x]+url[y]+path[z]+port[i]+query[j]));
              else 
                assertFalse(validator.isValid( address[x]+url[y]+path[z]+port[i]+query[j]));
            }

    for(int j=0; j < query.length; j++)
      for(int i=0; i < port.length; i++)
        for(int z=0; z < path.length; z++)
          for(int x=0; x < address.length; x++)
            for(int y=0; y < url.length; y++) {         
              if( validator.isValid( address[x]+url[y]+path[z]+port[i]+query[j]) ) 
                assertTrue(validator.isValid( address[x]+url[y]+path[z]+port[i]+query[j]));
              else 
                assertFalse(validator.isValid( address[x]+url[y]+path[z]+port[i]+query[j]));
            }
  }
   
}
