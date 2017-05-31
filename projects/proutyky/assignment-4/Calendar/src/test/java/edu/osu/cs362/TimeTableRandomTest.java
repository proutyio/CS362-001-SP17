package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.GregorianCalendar;


public class TimeTableRandomTest {

	private static final long TestTimeout = 60 * 500 * 1; /* Timeout at 30 seconds */
	private static final int NUM_TESTS=100;
	
	private int hour = 23;
	private int minute = 60;
	private int day = 30;
	private int month = 12;
	private int startyear = 1900, endyear = 2018;
	private int diff = -30;

	public static String RandomSelectMethod(Random random){
		String[] methodArray = new String[] {"testA","testB"};
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
			Appt apptA = new Appt(ValuesGenerator.getRandomIntBetween(random,1,this.hour),
								  ValuesGenerator.getRandomIntBetween(random,1,this.minute),
								  ValuesGenerator.getRandomIntBetween(random,1,this.day),
								  ValuesGenerator.getRandomIntBetween(random,1,this.month),
								  ValuesGenerator.getRandomIntBetween(random,this.startyear,this.endyear),
								  ValuesGenerator.getString(random),
								  ValuesGenerator.getString(random));
			Appt apptB = new Appt(ValuesGenerator.getRandomIntBetween(random,1,this.hour),
								  ValuesGenerator.getRandomIntBetween(random,1,this.minute),
								  ValuesGenerator.getRandomIntBetween(random,1,this.day),
								  ValuesGenerator.getRandomIntBetween(random,1,this.month),
								  ValuesGenerator.getRandomIntBetween(random,this.startyear+200,this.endyear+250),
								  ValuesGenerator.getString(random),
								  ValuesGenerator.getString(random));
			Appt apptC = new Appt(ValuesGenerator.getRandomIntBetween(random,1,this.hour),
								  ValuesGenerator.getRandomIntBetween(random,1,this.minute),
								  ValuesGenerator.getRandomIntBetween(random,1,this.day),
								  ValuesGenerator.getRandomIntBetween(random,1,this.month),
								  ValuesGenerator.getRandomIntBetween(random,this.startyear,this.endyear),
								  ValuesGenerator.getString(random),
								  ValuesGenerator.getString(random));
			
			GregorianCalendar calA = new GregorianCalendar();
			calA.set(ValuesGenerator.getRandomIntBetween(random,this.startyear,this.endyear),
					 ValuesGenerator.getRandomIntBetween(random,1,this.month),
					 ValuesGenerator.getRandomIntBetween(random,1,this.month),
					 ValuesGenerator.getRandomIntBetween(random,1,this.month+12),
					 ValuesGenerator.getRandomIntBetween(random,1,this.minute),
					 ValuesGenerator.getRandomIntBetween(random,1,this.minute));
			GregorianCalendar calB = new GregorianCalendar();
			calB.set(ValuesGenerator.getRandomIntBetween(random,this.startyear+118,this.endyear+10),
					 ValuesGenerator.getRandomIntBetween(random,1,this.month),
					 ValuesGenerator.getRandomIntBetween(random,1,this.month),
					 ValuesGenerator.getRandomIntBetween(random,1,this.month+12),
					 ValuesGenerator.getRandomIntBetween(random,1,this.minute),
					 ValuesGenerator.getRandomIntBetween(random,1,this.minute));
			GregorianCalendar calC = new GregorianCalendar();
			calC.set(ValuesGenerator.getRandomIntBetween(random,this.startyear+128,this.endyear+10),
					 ValuesGenerator.getRandomIntBetween(random,1,this.month),
					 ValuesGenerator.getRandomIntBetween(random,1,this.month),
					 ValuesGenerator.getRandomIntBetween(random,1,this.month+12),
					 ValuesGenerator.getRandomIntBetween(random,1,this.minute),
					 ValuesGenerator.getRandomIntBetween(random,1,this.minute));
			
			TimeTable timeTable = new TimeTable();
			CalDay calDay = new CalDay(calA);
			calDay.addAppt(apptA);
			calDay.addAppt(apptB);
			String methodName = TimeTableRandomTest.RandomSelectMethod(random);
			if (methodName.equals("testB")) {
				timeTable.getApptRange(calDay.getAppts(), calA, calC);
			}
			if (methodName.equals("testA")) {
				timeTable.deleteAppt(calDay.getAppts(), apptA);
				assertEquals(null, timeTable.deleteAppt(calDay.getAppts(), apptC));
				calDay.addAppt(apptC);
				assertEquals(null, timeTable.deleteAppt(null, null));
				assertEquals(null, timeTable.deleteAppt(calDay.getAppts(), null));
				apptC = new Appt(ValuesGenerator.getRandomIntBetween(random,1,this.hour),
								 ValuesGenerator.getRandomIntBetween(random,1,this.minute),
								 ValuesGenerator.getRandomIntBetween(random,1,this.day),
								 ValuesGenerator.getRandomIntBetween(random,1,this.month),
								 ValuesGenerator.getRandomIntBetween(random,this.startyear,this.endyear),
								 ValuesGenerator.getString(random),
								 ValuesGenerator.getString(random));
				assertEquals(null, timeTable.deleteAppt(calDay.getAppts(), apptC));
			}
			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
		}
		System.out.println("Done testing...");
	}
}
