/*
 * This file was automatically generated by EvoSuite
 * Mon May 15 05:19:37 GMT 2017
 */

package edu.osu.cs362;

import org.junit.Test;
import static org.junit.Assert.*;

public class Appt_ESTest  {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Appt appt0 = new Appt(5, 5, 5, 5, 5, "?Ok12J/NhLmSy&2", "?Ok12J/NhLmSy&2");
      String string0 = appt0.toString();
      assertEquals("\t5/5/5 at 5:5am ,?Ok12J/NhLmSy&2, ?Ok12J/NhLmSy&2\n", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Appt appt0 = new Appt(12, 0, 0, 0, 12, "\"V", "\"V");
      appt0.setStartDay(12);
      appt0.setStartMonth(12);
      boolean boolean0 = appt0.getValid();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "1VG.:", "1VG.:");
      String string0 = appt0.getTitle();
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartHour());
      assertEquals("1VG.:", appt0.getDescription());
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals("1VG.:", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Appt appt0 = new Appt(1, 0, 1, 0, 0, "", "");
      int int0 = appt0.getStartYear();
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(1, appt0.getStartDay());
      assertEquals(0, int0);
      assertEquals(1, appt0.getStartHour());
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Appt appt0 = new Appt((-247), (-247), (-247), (-247), (-247), "[^t@u|%'#`", "/");
      int int0 = appt0.getStartYear();
      assertFalse(appt0.getValid());
      assertEquals((-247), int0);
      assertEquals(-247, appt0.getStartMonth());
      assertEquals(-247, appt0.getStartDay());
      assertEquals("/", appt0.getDescription());
      assertEquals(-247, appt0.getStartHour());
      assertEquals("[^t@u|%'#`", appt0.getTitle());
      assertEquals(-247, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Appt appt0 = new Appt(23, 23, 0, 3322, 0, "", "--%M--%z");
      int int0 = appt0.getStartMonth();
      assertEquals(23, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals("--%M--%z", appt0.getDescription());
      assertFalse(appt0.getValid());
      assertEquals(3322, int0);
      assertEquals("", appt0.getTitle());
      assertEquals(23, appt0.getStartHour());
      assertEquals(0, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Appt appt0 = new Appt((-204), (-204), (-204), (-204), 7, "", "o4A>pPwno;II");
      int int0 = appt0.getStartMonth();
      assertEquals(7, appt0.getStartYear());
      assertEquals(-204, appt0.getStartMinute());
      assertEquals("o4A>pPwno;II", appt0.getDescription());
      assertEquals(-204, appt0.getStartDay());
      assertEquals("", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(-204, appt0.getStartHour());
      assertEquals((-204), int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Appt appt0 = new Appt(1, 1, 244, (-802), 244, "", "");
      int int0 = appt0.getStartMinute();
      assertEquals(244, appt0.getStartDay());
      assertEquals(-802, appt0.getStartMonth());
      assertEquals(1, int0);
      assertEquals(244, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(1, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Appt appt0 = new Appt((-193), (-193), (-193), 0, (-193), "", "");
      int int0 = appt0.getStartMinute();
      assertEquals(-193, appt0.getStartHour());
      assertEquals(-193, appt0.getStartYear());
      assertEquals(-193, appt0.getStartDay());
      assertFalse(appt0.getValid());
      assertEquals((-193), int0);
      assertEquals(0, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Appt appt0 = new Appt(0, (-2135), 0, (-786), (-2135), "", "B*+j");
      int int0 = appt0.getStartHour();
      assertEquals(-2135, appt0.getStartMinute());
      assertEquals(-2135, appt0.getStartYear());
      assertEquals("B*+j", appt0.getDescription());
      assertEquals(0, appt0.getStartDay());
      assertEquals(-786, appt0.getStartMonth());
      assertEquals(0, int0);
      assertEquals("", appt0.getTitle());
      assertFalse(appt0.getValid());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Appt appt0 = new Appt(12, 0, 0, 0, 12, "\"V", "\"V");
      int int0 = appt0.getStartHour();
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals("\"V", appt0.getTitle());
      assertEquals(12, appt0.getStartYear());
      assertEquals(12, int0);
      assertEquals("\"V", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Appt appt0 = new Appt(0, 12, 12, 0, 12, "1903-03-01T00:00:00Z", "1903-03-01T00:00:00Z");
      assertEquals(12, appt0.getStartDay());
      
      appt0.setStartDay(0);
      int int0 = appt0.getStartDay();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Appt appt0 = new Appt(12, 0, 0, 0, 12, "\"V", "\"V");
      assertEquals(0, appt0.getStartDay());
      
      appt0.setStartDay(12);
      int int0 = appt0.getStartDay();
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Appt appt0 = new Appt(Integer.MAX_VALUE, Integer.MAX_VALUE, (-2414), Integer.MAX_VALUE, (-2414), "TooLarge", "TooLarge");
      assertEquals("TooLarge", appt0.getDescription());
      
      appt0.setDescription("");
      appt0.getDescription();
      assertEquals(-2414, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, (-2884), 0, "lYe|bLgPO", "");
      assertEquals("lYe|bLgPO", appt0.getTitle());
      
      appt0.setTitle("");
      assertEquals("", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Appt appt0 = new Appt((-193), (-193), (-193), 0, (-193), "", "");
      appt0.setTitle((String) null);
      assertEquals(-193, appt0.getStartHour());
      assertEquals(-193, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(-193, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(-193, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Appt appt0 = new Appt((-204), (-204), (-204), (-204), 7, "", "o4A>pPwno;II");
      String string0 = appt0.getTitle();
      assertEquals(-204, appt0.getStartHour());
      assertFalse(appt0.getValid());
      assertEquals(-204, appt0.getStartMinute());
      assertEquals(-204, appt0.getStartMonth());
      assertEquals(7, appt0.getStartYear());
      assertEquals(-204, appt0.getStartDay());
      assertEquals("o4A>pPwno;II", appt0.getDescription());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "ab&\"B6l4<CD=J", "ab&\"B6l4<CD=J");
      boolean boolean0 = appt0.getValid();
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartDay());
      assertEquals(0, appt0.getStartHour());
      assertFalse(boolean0);
      assertEquals("ab&\"B6l4<CD=J", appt0.getTitle());
      assertEquals("ab&\"B6l4<CD=J", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Appt appt0 = new Appt((-1835), (-306), (-306), (-306), 0, "", "");
      int int0 = appt0.getStartHour();
      assertEquals((-1835), int0);
      assertEquals(0, appt0.getStartYear());
      assertFalse(appt0.getValid());
      assertEquals(-306, appt0.getStartMinute());
      assertEquals(-306, appt0.getStartMonth());
      assertEquals(-306, appt0.getStartDay());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Appt appt0 = new Appt(12, 0, 0, 0, 12, "\"V", "\"V");
      int int0 = appt0.getStartYear();
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals(12, int0);
      assertEquals("\"V", appt0.getDescription());
      assertEquals(12, appt0.getStartHour());
      assertEquals("\"V", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Appt appt0 = new Appt(12, 0, 0, 0, 12, "\"V", "\"V");
      int int0 = appt0.getStartMinute();
      assertEquals("\"V", appt0.getTitle());
      assertEquals(0, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals("\"V", appt0.getDescription());
      assertEquals(0, int0);
      assertEquals(12, appt0.getStartYear());
      assertEquals(0, appt0.getStartDay());
      assertEquals(12, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Appt appt0 = new Appt(12, 0, 0, 0, 12, "\"V", "\"V");
      String string0 = appt0.getDescription();
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartDay());
      assertEquals(12, appt0.getStartHour());
      assertEquals(12, appt0.getStartYear());
      assertEquals("\"V", appt0.getTitle());
      assertEquals("\"V", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "ab&\"B6l4<CD=J", "ab&\"B6l4<CD=J");
      int int0 = appt0.getStartMonth();
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, int0);
      assertEquals("ab&\"B6l4<CD=J", appt0.getDescription());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
      assertEquals("ab&\"B6l4<CD=J", appt0.getTitle());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 0, 0, 0, "ab&\"B6l4<CD=J", "ab&\"B6l4<CD=J");
      String string0 = appt0.toString();
      assertEquals("ab&\"B6l4<CD=J", appt0.getTitle());
      assertEquals(0, appt0.getStartHour());
      assertNull(string0);
      assertEquals(0, appt0.getStartMonth());
      assertEquals(0, appt0.getStartYear());
      assertEquals(0, appt0.getStartMinute());
      assertEquals(0, appt0.getStartDay());
      assertEquals("ab&\"B6l4<CD=J", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Appt appt0 = new Appt(0, 59, (-2615), 59, 59, (String) null, (String) null);
      assertEquals(59, appt0.getStartYear());
      assertEquals(-2615, appt0.getStartDay());
      assertEquals(0, appt0.getStartHour());
      assertEquals(59, appt0.getStartMonth());
      assertFalse(appt0.getValid());
      assertEquals(59, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, 31, 31, 31, "$Cn", "$Cn");
      assertEquals("$Cn", appt0.getDescription());
      assertEquals(31, appt0.getStartDay());
      assertEquals(0, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(31, appt0.getStartMonth());
      assertEquals("$Cn", appt0.getTitle());
      assertEquals(0, appt0.getStartHour());
      assertEquals(31, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Appt appt0 = new Appt(0, 0, (-1790), 0, (-1790), "", "");
      appt0.setStartMinute(117);
      assertEquals(117, appt0.getStartMinute());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Appt appt0 = new Appt(0, (-657), (-926), (-926), 0, "F,K+sl", " at ");
      int int0 = appt0.getStartDay();
      assertEquals((-926), int0);
      assertEquals("F,K+sl", appt0.getTitle());
      assertFalse(appt0.getValid());
      assertEquals(0, appt0.getStartHour());
      assertEquals(0, appt0.getStartYear());
      assertEquals(-657, appt0.getStartMinute());
      assertEquals(-926, appt0.getStartMonth());
      assertEquals(" at ", appt0.getDescription());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Appt appt0 = new Appt(2568, 2568, (-1), 1970, (-3221), "pm", "");
      assertEquals("", appt0.getDescription());
      
      appt0.setDescription((String) null);
      assertEquals("pm", appt0.getTitle());
      assertEquals(-1, appt0.getStartDay());
      assertEquals(-3221, appt0.getStartYear());
      assertEquals(2568, appt0.getStartHour());
      assertEquals(2568, appt0.getStartMinute());
      assertFalse(appt0.getValid());
      assertEquals(1970, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Appt appt0 = new Appt(1, 0, 1, 0, 0, "", "");
      assertEquals(1, appt0.getStartHour());
      
      appt0.setStartHour((-1));
      assertEquals(-1, appt0.getStartHour());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Appt appt0 = new Appt(12, 0, 0, 0, 12, "\"V", "\"V");
      appt0.setStartYear((-1));
      assertEquals(-1, appt0.getStartYear());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Appt appt0 = new Appt(12, 0, 0, 0, 12, "\"V", "\"V");
      appt0.setStartDay(12);
      appt0.setStartMonth(12);
      appt0.toString();
      assertEquals(12, appt0.getStartMonth());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Appt appt0 = new Appt(11, 11, 11, 11, 11, (String) null, " m/_L&||3]0S1YKY+");
      String string0 = appt0.toString();
      assertEquals("\t11/11/11 at 11:11am ,,  m/_L&||3]0S1YKY+\n", string0);
      assertNotNull(string0);
  }
}
