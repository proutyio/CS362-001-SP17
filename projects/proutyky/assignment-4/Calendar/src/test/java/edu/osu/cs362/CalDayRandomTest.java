package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalDayRandomTest {

	private static final long TestTimeout = 60 * 50 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;

	private int hour = 23;
	private int minute = 59;
	private int day = 30;
	private int month = 12;
	private int startyear = 1900, endyear = 2018;
	private int diff = -30;

	public static String RandomSelectMethod(Random random){
		String[] methodArray = new String[] {"setTitle","setDescription"};
		int n = random.nextInt(methodArray.length);
		return methodArray[n];
	}

	@Test
	public void randomtest()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		
		System.out.println("Start testing...");
		for (int iteration = 0; elapsed < TestTimeout; iteration++) {
			Random random = new Random();
			GregorianCalendar cal = new GregorianCalendar();
			cal.set(ValuesGenerator.getRandomIntBetween(random,this.startyear,this.endyear), 
					ValuesGenerator.getRandomIntBetween(random,1,this.month), 
					ValuesGenerator.getRandomIntBetween(random,1,this.day-18),
					ValuesGenerator.getRandomIntBetween(random,1,this.hour+1), 
					ValuesGenerator.getRandomIntBetween(random,1,this.minute+1), 
					ValuesGenerator.getRandomIntBetween(random,1,this.minute+1));
			CalDay calDay = new CalDay(cal);
			Appt appt = new Appt(ValuesGenerator.getRandomIntBetween(random,1,this.hour), 
								 ValuesGenerator.getRandomIntBetween(random,1,this.minute),
								 ValuesGenerator.getRandomIntBetween(random,1,this.day),
								 ValuesGenerator.getRandomIntBetween(random,1,this.month),
								 ValuesGenerator.getRandomIntBetween(random,this.startyear,this.endyear),
								 ValuesGenerator.getString(random),
								 ValuesGenerator.getString(random));
			calDay.addAppt(appt);
			assertEquals(calDay.getSizeAppts(),1);
			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if ((iteration % 10000) == 0 && iteration != 0) System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
		}
		System.out.println("Done testing...");
	}
}