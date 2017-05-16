package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;
import java.util.Calendar;
import java.util.GregorianCalendar;
import static org.junit.Assert.*;

public class ApptTest {

	Calendar calendar = Calendar.getInstance();
	int startHour=13;
	int startMinute=30;
	int startDay=10;
	int startMonth=4;
	int startYear=2017;
	String title="Birthday Party";
	String description="This is my birthday party.";
	Appt appt = new Appt(startHour,
		        startMinute ,
		        startDay ,
		        startMonth ,
		        startYear ,
		        title,
		       description);


	@Test
	public void testGetters()  throws Throwable  {
		int startHour=13;
		int startMinute=30;
		int startDay=10;
		int startMonth=4;
		int startYear=2017;
		String title="Birthday Party";
		String description="This is my birthday party.";
		Appt appt = new Appt(startHour,
		      startMinute ,
		      startDay ,
		      startMonth ,
		      startYear ,
		      title,
		     description);
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());         		
	}


	@Test
	public void testSetters() throws Throwable {
		try{
			Appt appt = new Appt(11,
								00,
								this.calendar.get(Calendar.DAY_OF_MONTH),
								this.calendar.get(Calendar.MONTH),
								this.calendar.get(Calendar.YEAR),
								"Car Appt",
								"Oil Change");
			appt.toString();

			appt.setTitle(null);
			appt.setTitle("Changed Car Appt");
			appt.setDescription(null);
			appt.setDescription("Oil Change and Transmission flush");
		} catch(Exception e){}
	}



	@Test
	public void testIsValid() throws Throwable {
		try{
			Appt appt = new Appt(11,
								00,
								this.calendar.get(Calendar.DAY_OF_MONTH),
								this.calendar.get(Calendar.MONTH),
								this.calendar.get(Calendar.YEAR),
								"Car Appt",
								"Oil Change");
			new Appt((-1),
					 30,
					 10,
					 this.calendar.get(Calendar.MONTH),
					 this.calendar.get(Calendar.YEAR),
					 "Car Appt",
					 "Oil Change");

			new Appt(10,
					 (-1),
					 10,
					 this.calendar.get(Calendar.MONTH),
					 this.calendar.get(Calendar.YEAR),
					 "Car Appt",
					 "Oil Change");

			new Appt(10,
					 00,
					 100,
					 this.calendar.get(Calendar.MONTH),
					 this.calendar.get(Calendar.YEAR),
					 "Car Appt",
					 "Oil Change");

			new Appt(10,
					 00,
					 10,
					 100,
					 this.calendar.get(Calendar.YEAR),
					 "Car Appt",
					 "Oil Change");

		} catch(Exception e){}
	}		   
    
	@Test
	public void testA()  throws Throwable {
		assertTrue(appt.getValid());
		appt.setStartMonth(13);
		assertFalse(appt.getValid());
		appt.setStartMonth(0);
		assertFalse(appt.getValid());
		appt.setStartDay(32);
		assertFalse(appt.getValid());
		appt.setStartDay(0);
		assertFalse(appt.getValid());
		appt.setStartMinute(60);
		assertFalse(appt.getValid());
		appt.setStartMinute(-1);
		assertFalse(appt.getValid());
		appt.setStartHour(24);
		assertFalse(appt.getValid());
		appt.setStartHour(-1);
		assertFalse(appt.getValid());			
	}
	 
	@Test
	public void testB()	throws Throwable{
		assertTrue(appt.getValid());
		assertEquals(13, appt.getStartHour());
		assertEquals(30, appt.getStartMinute());
		assertEquals(10, appt.getStartDay());
		assertEquals(04, appt.getStartMonth());
		assertEquals(2017, appt.getStartYear());
		assertEquals("Birthday Party", appt.getTitle());
		assertEquals("This is my birthday party.", appt.getDescription());
		assertTrue(appt.getValid());
		appt.setStartHour(12);
		assertTrue(appt.getValid());
		appt.setStartMinute(12);
		assertTrue(appt.getValid());
		appt.setStartDay(6);
		assertTrue(appt.getValid());
		appt.setStartMonth(11);
		assertTrue(appt.getValid());
		appt.setStartYear(2017);
		assertTrue(appt.getValid());
		appt.setTitle(null);
		assertEquals("", appt.getTitle());
		appt.setTitle("Test");
		assertEquals("Test", appt.getTitle());
		appt.setDescription(null);
		assertEquals("", appt.getDescription());
		appt.setDescription("Null");
		assertEquals("Null", appt.getDescription()); 
		assertTrue(appt.getValid());
		appt.setStartMonth(13);
		assertNull(appt.toString()); 
		appt.setStartMonth(12); 
		appt.setStartHour(11); 
		assertFalse(appt.toString().contains("pm"));
		assertFalse(appt.toString().contains("-1"));
	}
	  
	
	@Test
	public void testC()	throws Throwable{
		appt.setStartHour(-1); 
		assertFalse(appt.getValid()); 
		appt.setStartHour(0);
		assertTrue(appt.getValid()); 
		appt.setStartHour(24);
		assertFalse(appt.getValid());
		appt.setStartHour(23);
		assertTrue(appt.getValid());
		appt.setStartMinute(-1); 
		assertFalse(appt.getValid());
		appt.setStartMinute(0);
		assertTrue(appt.getValid()); 
		appt.setStartMinute(60);
		assertFalse(appt.getValid());
		appt.setStartMinute(59);
		assertTrue(appt.getValid());
		appt.setStartDay(0); 
		assertFalse(appt.getValid());		
		appt.setStartDay(1);
		assertTrue(appt.getValid()); 		
		appt.setStartDay(32);
		assertFalse(appt.getValid());		
		appt.setStartDay(31);
		assertTrue(appt.getValid());		
		appt.setStartMonth(0); 
		assertFalse(appt.getValid());		
		appt.setStartMonth(1);
		assertTrue(appt.getValid()); 		
		appt.setStartMonth(13);
		assertFalse(appt.getValid());		
		appt.setStartMonth(12);
		assertTrue(appt.getValid());
	}

	@Test
	public void testD()	throws Throwable{
		Appt a = appt;
		Appt b;
		a.setStartHour(12);
		if(a.getValid() == true) {
			b = new Appt(a.getStartHour(),2,2,2,2017,a.getTitle(),a.getDescription());
			assertTrue(b.getValid());
		}
		a.setStartHour(2);
		a.setStartMinute(90);
		if(a.getValid() == true){
			b = new Appt(2,a.getStartMinute(),2,2,2017,a.getTitle(),a.getDescription());
			assertTrue(b.getValid());
		}				
		a.setStartMinute(2);
		a.setStartDay(12);
		if(a.getValid() == true) {
			b = new Appt(2,2,a.getStartDay(),2,2017,a.getTitle(),a.getDescription());
			assertTrue(b.getValid());
		}
	}


	@Test
	public void testE()  throws Throwable  {
		Appt appt0 = new Appt(1, 1, 1, 11, 11, "Trial", "test");
		String string0 = appt0.toString();
		assertEquals("\t11/1/11 at 1:1am ,Trial, test\n", string0);
		assertNotNull(string0);
		assertEquals(1, appt0.getStartDay());
		appt0.setStartDay(31);
		assertEquals(31, appt0.getStartDay());
		assertEquals(1, appt0.getStartMinute());
		assertEquals("test", appt0.getDescription());
		assertEquals(11, appt0.getStartYear());
		assertEquals("Trial", appt0.getTitle());
		assertEquals(1, appt0.getStartHour());
		assertEquals(11, appt0.getStartMonth());
		appt0.setStartMinute(818);
		assertEquals(818, appt0.getStartMinute());

		appt0 = new Appt(0, 0, 0, 0, 0, (String) null, (String) null);
		string0 = appt0.getTitle();
		assertEquals(0, appt0.getStartMinute());
		assertEquals(0, appt0.getStartMonth());
		assertFalse(appt0.getValid());
		assertEquals(0, appt0.getStartHour());
		assertEquals(0, appt0.getStartDay());
		assertNotNull(string0);
		assertEquals(0, appt0.getStartYear());

		appt0 = new Appt(109, 109, 12, 109, 12, "test", "testing");
		int int0 = appt0.getStartYear();
		assertEquals("test", appt0.getTitle());
		assertEquals(12, int0);
		assertFalse(appt0.getValid());
		assertEquals(12, appt0.getStartDay());
		assertEquals(109, appt0.getStartMinute());
		assertEquals(109, appt0.getStartHour());
		assertEquals("testing", appt0.getDescription());
		assertEquals(109, appt0.getStartMonth());

		appt0 = new Appt((-79), 2328, (-79), (-709), (-709), "time testing", "description");
		int0 = appt0.getStartYear();
		assertEquals(-79, appt0.getStartHour());
		assertEquals(-709, appt0.getStartMonth());
		assertEquals(2328, appt0.getStartMinute());
		assertFalse(appt0.getValid());
		assertEquals((-709), int0);
		assertEquals("time testing", appt0.getTitle());
		assertEquals(-79, appt0.getStartDay());
		assertEquals("description", appt0.getDescription());

		appt0 = new Appt((-1), (-1), (-1), 0, 0, "The test", "the description");
		int0 = appt0.getStartMonth();
		assertEquals(-1, appt0.getStartHour());
		assertEquals("The test", appt0.getTitle());
		assertEquals(-1, appt0.getStartMinute());
		assertFalse(appt0.getValid());
		assertEquals(0, appt0.getStartYear());
		assertEquals("the description", appt0.getDescription());
		assertEquals(0, int0);
		assertEquals(-1, appt0.getStartDay());

		appt0 = new Appt(0, 59, 59, 59, 23, "test", "descript");
		int0 = appt0.getStartMonth();
		assertEquals(59, appt0.getStartDay());
		assertEquals(59, appt0.getStartMinute());
		assertEquals(23, appt0.getStartYear());
		assertEquals(59, int0);
		assertEquals(0, appt0.getStartHour());
		assertFalse(appt0.getValid());
	}

	@Test(timeout = 4000)
	public void testF()  throws Throwable  {
		Appt appt0 = new Appt((-538), (-538), (-538), (-538), 0, (String) null, (String) null);
		int int0 = appt0.getStartMinute();
		assertEquals(-538, appt0.getStartMonth());
		assertEquals(-538, appt0.getStartHour());
		assertEquals((-538), int0);
		assertEquals(-538, appt0.getStartDay());
		assertEquals(0, appt0.getStartYear());
		assertFalse(appt0.getValid());

		appt0 = new Appt(0, 0, 2714, (-1030), (-1030), "z", "z");
		int0 = appt0.getStartHour();
		assertEquals(0, appt0.getStartMinute());
		assertEquals(2714, appt0.getStartDay());
		assertFalse(appt0.getValid());
		assertEquals(-1030, appt0.getStartYear());
		assertEquals(-1030, appt0.getStartMonth());
		assertEquals(0, int0);
		assertEquals("z", appt0.getDescription());
		assertEquals("z", appt0.getTitle());

		appt0 = new Appt(1, 1, 1, 11, 11, "BasketBall is awesome to play with friends", "");
		int0 = appt0.getStartDay();
		assertEquals(1, appt0.getStartMinute());
		assertEquals(1, int0);
		assertEquals("", appt0.getDescription());
		assertTrue(appt0.getValid());
		assertEquals(11, appt0.getStartYear());
		assertEquals(11, appt0.getStartMonth());
		assertEquals("BasketBall is awesome to play with friends", appt0.getTitle());
		assertEquals(1, appt0.getStartHour());

		appt0 = new Appt((-599), (-599), (-599), (-599), (-599), "", "");
		appt0.getDescription();
		assertFalse(appt0.getValid());
		assertEquals(-599, appt0.getStartDay());
		assertEquals(-599, appt0.getStartMinute());
		assertEquals(-599, appt0.getStartMonth());
		assertEquals(-599, appt0.getStartYear());
		assertEquals(-599, appt0.getStartHour());
	}

	@Test(timeout = 4000)
	public void testG()  throws Throwable  {
		Appt appt0 = new Appt((-1078), 744, 3973, (-1078), 3973, "", "");
		appt0.setDescription("");
		assertEquals(3973, appt0.getStartYear());
		assertFalse(appt0.getValid());
		assertEquals(744, appt0.getStartMinute());
		assertEquals(-1078, appt0.getStartMonth());
		assertEquals(3973, appt0.getStartDay());
		assertEquals(-1078, appt0.getStartHour());

		appt0 = new Appt(0, 0, (-2371), 0, (-2686), (String) null, (String) null);
		appt0.setDescription((String) null);
		assertEquals(0, appt0.getStartMinute());
		assertEquals(0, appt0.getStartMonth());
		assertEquals(-2371, appt0.getStartDay());
		assertFalse(appt0.getValid());
		assertEquals(-2686, appt0.getStartYear());
		assertEquals(0, appt0.getStartHour());

		appt0 = new Appt(0, 0, 316, 316, 316, "/", "/");
		appt0.setTitle("/");
		assertEquals(316, appt0.getStartYear());
		assertEquals("/", appt0.getDescription());
		assertEquals(316, appt0.getStartDay());
		assertEquals("/", appt0.getTitle());
		assertEquals(0, appt0.getStartMinute());
		assertEquals(0, appt0.getStartHour());
		assertFalse(appt0.getValid());
		assertEquals(316, appt0.getStartMonth());

		appt0 = new Appt((-538), (-538), (-538), (-538), 0, (String) null, (String) null);
		appt0.setTitle((String) null);
		assertEquals(-538, appt0.getStartDay());
		assertEquals(-538, appt0.getStartMonth());
		assertEquals(-538, appt0.getStartHour());
		assertEquals(0, appt0.getStartYear());
		assertEquals(-538, appt0.getStartMinute());
		assertFalse(appt0.getValid());

		appt0 = new Appt(0, 0, 316, 316, 316, "/", "/");
		String string0 = appt0.getDescription();
		assertEquals(316, appt0.getStartYear());
		assertEquals(0, appt0.getStartHour());
		assertFalse(appt0.getValid());
		assertEquals(316, appt0.getStartMonth());
		assertEquals("/", string0);
		assertEquals("/", appt0.getTitle());
		assertEquals(0, appt0.getStartMinute());
		assertEquals(316, appt0.getStartDay());

		appt0 = new Appt(12, 12, 12, (-1023), (-1023), "Dogs are awesome", "Cats are too");
		assertEquals(-1023, appt0.getStartMonth());

		appt0.setStartMonth(12);
		string0 = appt0.toString();
		assertEquals("\t12/12/-1023 at 12:12pm ,Dogs are awesome, Cats are too\n", string0);

		appt0 = new Appt(23, 23, 23, 23, 23, "", "");
		assertEquals(23, appt0.getStartMonth());
		assertEquals(23, appt0.getStartDay());
		assertEquals(23, appt0.getStartMinute());
		assertEquals(23, appt0.getStartYear());
		assertEquals(23, appt0.getStartHour());
		assertFalse(appt0.getValid());

		appt0 = new Appt((-413), (-413), (-413), -1984, 0, "Tennis is fun", "Football is too");
		int int0 = appt0.getStartYear();
		assertFalse(appt0.getValid());
		assertEquals(0, int0);
		assertEquals(-413, appt0.getStartMinute());
		assertEquals("Tennis is fun", appt0.getTitle());
		assertEquals(-413, appt0.getStartHour());
		assertEquals(-1984, appt0.getStartMonth());
		assertEquals("Football is too", appt0.getDescription());
		assertEquals(-413, appt0.getStartDay());

		appt0 = new Appt(11, 1, 1, (-1078), 2907, "", "");
		assertEquals(11, appt0.getStartHour());
		assertEquals(2907, appt0.getStartYear());
		assertEquals(1, appt0.getStartDay());
		assertEquals(1, appt0.getStartMinute());
		assertEquals(-1078, appt0.getStartMonth());
		string0 = appt0.toString();
		assertFalse(appt0.getValid());
		appt0.setStartMonth(1);
		appt0.setStartYear((-1078));
	}
}
