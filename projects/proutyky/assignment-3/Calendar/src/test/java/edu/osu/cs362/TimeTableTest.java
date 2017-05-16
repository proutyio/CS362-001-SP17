package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


public class TimeTableTest {

	@Test
	public void testA()	throws Throwable {
		TimeTable table = new TimeTable();	
		LinkedList<Appt> appt = new LinkedList<Appt>();
		Appt a = new Appt(12, 22, 22, 1, 2020, "x", "x");
		Appt b = new Appt(12, 22, 22, 1, 2020, "x", "x");
		Appt c = new Appt(12, 22, 22, 1, 2020, "x", "x");
		appt.add(a);
		appt.add(b);
		assertNotNull(table.deleteAppt(appt,a));
		assertNotNull(table.deleteAppt(appt,b));
	}

	@Test
	public void testB()  throws Throwable  {
		TimeTable table = new TimeTable();	
		LinkedList<Appt> appt = new LinkedList<Appt>();
		appt.add(new Appt(12, 22, 22, 1, 2020, "x", "x"));
		appt.add(new Appt(12, 22, 22, 1, 2020, "x", "x"));
		appt.add(new Appt(12, 22, 22, 1, 2020, "x", "x")); 
		table.getApptRange(appt, new GregorianCalendar(2017, 2, 2, 22, 22, 0),new GregorianCalendar(2017, 3, 3, 22, 22, 0));
		appt.add(new Appt(0, 0, 0, 0, 0, "", ""));		
		table.getApptRange(appt, new GregorianCalendar(2017, 2, 2, 22, 22, 0),new GregorianCalendar(2017, 3, 3, 22, 22, 0));

		LinkedList<Appt> apptB = new LinkedList<Appt>();
		Appt appointment = new Appt(12, 22, 22, 1, 2020, "x", "x");
		apptB.add(appointment);	
		apptB.add(new Appt(12, 22, 22, 1, 2020, "x", "x"));
		apptB.add(new Appt(12, 22, 22, 1, 2020, "x", "x")); 
		assertNotNull(table.deleteAppt(apptB, appointment));
		assertTrue(table.deleteAppt(apptB, null) == null);
		assertTrue(table.deleteAppt(null,new Appt(12, 22, 22, 1, 2020, "x", "x")) == null);
		assertTrue(table.deleteAppt(apptB,new Appt(0, 0, 0, 0, 0, "", "")) == null);

		LinkedList<Appt> apptC = new LinkedList<Appt>();
		apptC.add(new Appt(12, 22, 22, 1, 2020, "x", "x"));
		apptC.add(new Appt(12, 22, 22, 1, 2020, "x", "x"));
		
		LinkedList<CalDay> temp;
		temp = table.getApptRange(apptC,new GregorianCalendar(2017, 2, 2, 22, 22, 0),new GregorianCalendar(2017, 3, 3, 22, 22, 0));
		assertTrue(temp.get(0).getSizeAppts() == 0);
	}

	@Test
	public void testC()  throws Throwable  {
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

		 startHour = 15;
		 startMinute = 35;
		 startDay = 15;
		 startMonth = 9;
		 startYear = 2020;
		 title = "Birthday Party";
		 description = "This is my birthday party.";
		 Appt apptS = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);

		 GregorianCalendar cal = new GregorianCalendar();
		 cal.set(2000, 3, 10, 10, 10 , 15);
		 CalDay calDay = new CalDay(cal);
		 calDay.addAppt(appt);
		 calDay.addAppt(apptS);
		 GregorianCalendar gCal = new GregorianCalendar();
		 gCal.set(2000, 3, 11, 11, 11, 11);
		 GregorianCalendar goCal = new GregorianCalendar();
		 gCal.set(2020, 5, 15, 15, 15, 15);
		 TimeTable timeTable = new TimeTable();
		 assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, gCal));
		 assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, goCal));
		 assertNotEquals(null, timeTable.deleteAppt(calDay.getAppts(), appt));
		 startHour = 10;
		 startMinute = 10;
		 startDay = 40;
		 startMonth = 10;
		 startYear = 2020;
		 title = "Birthday Party";
		 description = "This is my birthday party.";
		 Appt apptY = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);
	
		
		assertEquals(null, timeTable.deleteAppt( calDay.getAppts(), apptY ) );
		calDay.addAppt(apptY);
		assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, gCal));
		assertEquals(null, timeTable.deleteAppt(null, null ) );
		assertEquals(null, timeTable.deleteAppt(calDay.getAppts(), null ) );
		startDay = 10;
		apptY = new Appt(startHour,
				 startMinute,
				 startDay,
				 startMonth,
				 startYear,
				 title,
				 description);
		assertEquals(null, timeTable.deleteAppt( calDay.getAppts(), apptY ) );
		calDay.addAppt(apptY);
		
	 }

	@Test
	public void testD()  throws Throwable  {
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
		startHour = 15;
		startMinute = 35;
		startDay = 9;
		startMonth = 9;
		startYear = 2020;
		title = "Birthday Party";
		description = "This is my birthday party.";

		Appt apptS = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);

		GregorianCalendar cal = new GregorianCalendar();
		cal.set(2000, 3, 10, 10, 10 , 15);
		CalDay calDay = new CalDay(cal);
		calDay.addAppt(appt);
		calDay.addAppt(apptS);
		GregorianCalendar gCal = new GregorianCalendar();
		gCal.set(2000, 3, 11, 11, 11, 11);
		GregorianCalendar goCal = new GregorianCalendar();
		gCal.set(2020, 5, 9, 15, 15, 15);
		TimeTable timeTable = new TimeTable();
		assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, gCal));
		assertNotEquals(null, timeTable.getApptRange(calDay.getAppts(), cal, goCal));
		assertNotEquals(null, timeTable.deleteAppt(calDay.getAppts(), appt));
		startHour = 10;
		startMinute = 10;
		startDay = 40;
		startMonth = 10;
		startYear = 2020;
		title = "Birthday Party";
		description = "This is my birthday party.";
		Appt apptY = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		assertEquals(null, timeTable.deleteAppt( calDay.getAppts(), apptY ) );
		calDay.addAppt(apptY);
		timeTable.getApptRange(calDay.getAppts(), cal, gCal);
		assertEquals(null, timeTable.deleteAppt(null, null ) );
		assertEquals(null, timeTable.deleteAppt(calDay.getAppts(), null ) );
		startDay = 10;
		apptY = new Appt(startHour,
				startMinute,
				startDay,
				startMonth,
				startYear,
				title,
				description);
		assertEquals(null, timeTable.deleteAppt( calDay.getAppts(), apptY ) );
		calDay.addAppt(apptY);
	}

	@Test(timeout = 4000)
	  public void test07()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar(0, 0, 0, 0, 0, 0);
	      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
	      LinkedList<Appt> linkedList0 = calDay0.getAppts();
	      Appt appt0 = new Appt(1, 0, 781, 1, 781, "Second date specified is not before the first date specified.", "Second date specified is not before the first date specified.");
	      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, appt0);
	      assertNull(linkedList1);
	  }

	  @Test(timeout = 4000)
	  public void test08()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      GregorianCalendar mockGregorianCalendar0 = new GregorianCalendar(5, 5, 5, 5, 5);
	      CalDay calDay0 = new CalDay((GregorianCalendar) mockGregorianCalendar0);
	      LinkedList<Appt> linkedList0 = calDay0.getAppts();
	      LinkedList<Appt> linkedList1 = timeTable0.deleteAppt(linkedList0, (Appt) null);
	      assertNull(linkedList1);
	  }

	  @Test(timeout = 4000)
	  public void test09()  throws Throwable  {
	      TimeTable timeTable0 = new TimeTable();
	      LinkedList<Appt> linkedList0 = timeTable0.deleteAppt((LinkedList<Appt>) null, (Appt) null);
	      assertNull(linkedList0);
	  }
}
