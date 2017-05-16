package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;


public class CalDayTest {

	CalDay calday = new CalDay(new GregorianCalendar(2016, 2, 19, 22, 22, 0));
	@Test
	public void testA()  throws Throwable {
		int startHour = 13;
		int startMinute = 30;
		int startDay = 10;
		int startMonth = 4;
		int startYear = 2017;
		String title = "Birthday Party";
		String description = "This is my birthday party.";
		Appt appt = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		CalDay cal = new CalDay(new GregorianCalendar(2016, 2, 19, 22, 22, 0));
		assertNotEquals(null, cal.getAppts());
		assertNotEquals(null, cal.getDay());
		assertNotEquals(null, cal.getMonth());
		assertNotEquals(null, cal.getYear());
		assertNotEquals(null, cal.isValid());
		assertNotEquals(null, cal.iterator());
		assertNotEquals(null, cal.toString());
		assertNotEquals(null, cal.iterator());
		assertNotEquals(null, cal.toString());
		cal.addAppt(appt);
		assertNotEquals(null, cal.toString());
		assertEquals( 1, cal.getSizeAppts());
		assertNotEquals(null, cal.iterator());
	}
	
	@Test
	public void testB()	throws Throwable {
		calday = new CalDay();
		assertFalse(calday.isValid());
		calday = new CalDay(new GregorianCalendar(2016, 2, 19, 22, 22, 0));
		assertTrue(calday.isValid()); 
		assertEquals(0, calday.getSizeAppts());
		assertEquals(19, calday.getDay());
		assertEquals(2, calday.getMonth()); 
		assertEquals(2016, calday.getYear()); 
		assertTrue(calday.getAppts() != null);
	}
	
	@Test
	public void testC()	throws Throwable {
		calday.addAppt(new Appt(12, 22, 22, 10, 2020, "x", "x"));
		assertEquals(1, calday.getSizeAppts()); 
		calday.addAppt(new Appt(12, 22, 22, 10, 2020, "x", "x"));
		assertEquals(2, calday.getSizeAppts()); 
		calday.addAppt(new Appt(0, 0, 0, 0, 0, null, null));
		assertEquals(2, calday.getSizeAppts()); 
		calday.addAppt(new Appt(12, 22, 22, 10, 2020, "x", "x"));
		assertEquals(3, calday.getSizeAppts()); 
		
		Appt apptA = calday.getAppts().get(0);
		calday.addAppt(new Appt(12, 22, 22, 10, 2020, "x", "x"));
		assertEquals(4, calday.getSizeAppts()); 
		Appt apptB = calday.getAppts().get(1);
		assertNotSame(apptA, apptB); 
		for(int i = 0; i < (calday.getAppts().size() - 1) ; i++)
			assertTrue(calday.getAppts().get(i+1).getStartHour() >= calday.getAppts().get(i).getStartHour());
	}
	
	@Test
	public void testD()	throws Throwable {
		calday = new CalDay();
		assertEquals("", calday.toString());
		calday = new CalDay(new GregorianCalendar(2016, 2, 19, 22, 22, 0));
		calday.addAppt(new Appt(12, 22, 22, 10, 2020, "x", "x"));
		calday.addAppt(new Appt(12, 22, 22, 10, 2020, "x", "x"));
		assertTrue(calday.toString() != "");
		assertTrue(calday.toString().length() > 2);
		assertTrue(calday.iterator() != null);
		calday = new CalDay();
		assertTrue(calday.iterator() == null);
		CalDay calDay = new CalDay();
		assertFalse(calDay.isValid());
	}
	

	@Test
	public void testE()  throws Throwable {
		CalDay calDay0 = new CalDay();
		calDay0.isValid();

		GregorianCalendar GregorianCalendar0 = new GregorianCalendar();
		calDay0 = new CalDay(GregorianCalendar0);
		calDay0.getYear();

		calDay0 = new CalDay();
		calDay0.year = (-211);
		calDay0.getYear();

		calDay0 = new CalDay();
		calDay0.getMonth();

		GregorianCalendar0 = new GregorianCalendar(0, 0, 0);
		calDay0 = new CalDay(GregorianCalendar0);
		calDay0.month = 0;
		calDay0.month = (-573);
		calDay0.getMonth();

		GregorianCalendar0 = new GregorianCalendar(100, 1068, 1068, 1068, (-355), 72);
		calDay0 = new CalDay(GregorianCalendar0);
		calDay0.getDay();

		calDay0 = new CalDay();
		calDay0.day = (-133);
		calDay0.getDay();

		calDay0 = new CalDay();
		calDay0.getAppts();

		Locale locale0 = new Locale("\n", "\n", "Z,'0LoY.t6`");
		GregorianCalendar0 = new GregorianCalendar(locale0);
		calDay0 = new CalDay(GregorianCalendar0);
		Appt appt0 = new Appt(2, 1, 1, 1, 0, "x", "x ");
		calDay0.addAppt(appt0);
		calDay0.getSizeAppts();
		calDay0.addAppt(appt0);
		calDay0.getAppts();


		calDay0 = new CalDay();
		calDay0.valid = true;
		calDay0 = new CalDay();
		calDay0 = null;

		GregorianCalendar0 = new GregorianCalendar(2000, 1, 1, 1, 1);
		calDay0 = null;
		calDay0 = new CalDay(GregorianCalendar0);

		calDay0 = new CalDay();
		calDay0.getYear();

		calDay0 = new CalDay();
		calDay0.getDay();

		GregorianCalendar0 = new GregorianCalendar(0, 0, 0);
		calDay0 = new CalDay(GregorianCalendar0);
		calDay0.getMonth();
		calDay0.getAppts();
		calDay0.isValid();

		GregorianCalendar0 = new GregorianCalendar(0, (-1837), (-1837), 0, 0);
		calDay0 = new CalDay(GregorianCalendar0);
		LinkedList<Appt> linkedList0 = calDay0.appts;
		appt0 = new Appt(0, (-27), 1, 2, (-1837), "x", "x ");
		linkedList0.add(appt0);
		String string0 = calDay0.toString();

		calDay0 = new CalDay();
		string0 = calDay0.toString();
		assertEquals("", string0);

		calDay0 = new CalDay();
		Iterator<?> iterator0 = calDay0.iterator();
		assertNull(iterator0);

		calDay0 = new CalDay();
		linkedList0 = new LinkedList<Appt>();
		calDay0.appts = linkedList0;
		appt0 = new Appt(1, 17, 1375, 17, 1, " x","x");
		linkedList0.add(appt0);
		Appt appt1 = new Appt(0, 0, 17, 1, 0, " x", "x");
		calDay0.addAppt(appt1);
		calDay0.addAppt(appt1);
		assertEquals(3, calDay0.getSizeAppts());

		calDay0 = new CalDay();
		linkedList0 = new LinkedList<Appt>();
		calDay0.appts = linkedList0;
		appt0 = new Appt((-3659), (-1), 5, 57, 3630, " x", "x");
		linkedList0.add(appt0);
		appt1 = new Appt(0, 0, 1, 1, 44, " x", "x");
		calDay0.addAppt(appt1);
		assertEquals(2, calDay0.getSizeAppts());

		GregorianCalendar0 = new GregorianCalendar(100, 1068, 1068, 1068, (-355), 72);
		calDay0 = new CalDay(GregorianCalendar0);
		appt0 = new Appt(72, (-355), 72, (-355), 100, " x","x");
		calDay0.addAppt(appt0);
		assertTrue(calDay0.isValid());
		assertEquals(192, calDay0.getYear());
		assertEquals(0, calDay0.getMonth());
		assertEquals(17, calDay0.getDay());
		assertEquals(0, calDay0.getSizeAppts());

		GregorianCalendar0 = new GregorianCalendar(0, (-1837), (-1837), 0, 0);
		calDay0 = new CalDay(GregorianCalendar0);
		calDay0.getSizeAppts();
		assertEquals(19, calDay0.getDay());
		assertEquals(160, calDay0.getYear());
		assertEquals(10, calDay0.getMonth());
		assertTrue(calDay0.isValid());

		GregorianCalendar0 = new GregorianCalendar(0, (-1837), (-1837), 0, 0);
		calDay0 = new CalDay(GregorianCalendar0);
		iterator0 = calDay0.iterator();
		assertNotNull(iterator0);
		assertEquals(160, calDay0.getYear());
		assertEquals(19, calDay0.getDay());
		assertEquals(10, calDay0.getMonth());
	}
	
}
