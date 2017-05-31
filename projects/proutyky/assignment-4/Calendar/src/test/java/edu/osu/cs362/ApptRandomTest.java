package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;



public class ApptRandomTest {
	private static final long TestTimeout = 60 * 500 * 1; 
	private static final int NUM_TESTS=100;

	private int hour = 23;
	private int minute = 59;
	private int day = 30;
	private int month = 12;
	private int startyear = 1900, endyear = 2018;
	private int diff = -30;


    public static String RandomSelectMethod(Random random) {
        String[] methodArray = new String[] {"setTitle","setDescription","hour","minute","day","month"};
    	int n = random.nextInt(methodArray.length);
        return methodArray[n];
    }

    private boolean isValid(int low,int high,int rand) {
	 	if(rand < low || rand > high) return false;
	 	else return true;
	}
	
	@Test
	public void randomtest()  throws Throwable  {
		long startTime = Calendar.getInstance().getTimeInMillis();
		long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;
		System.out.println("Start testing...");
		for (int iteration = 0; elapsed < TestTimeout; iteration++) 
		{
			long randomseed = 10;
			Random random = new Random(randomseed);
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
		///////////////////////////////////////////////
		//		
		//	Random Tests
		//
		///////////////////////////////////////////////
			for (int i = 0; i < NUM_TESTS; i++) {
				String methodName = ApptRandomTest.RandomSelectMethod(random);
				random = new Random();
				if (methodName.equals("setDescription")) {
			 		appt.setDescription("description");
			 		assertEquals(appt.getDescription(), "description");
				} 
				if(methodName.equals("hour")) {
					appt = new Appt(ValuesGenerator.getRandomIntBetween(random, this.diff, this.hour+37), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.minute), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.day), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.month),
									ValuesGenerator.getRandomIntBetween(random, this.startyear, this.endyear),
									ValuesGenerator.getString(random), 
									ValuesGenerator.getString(random));
					assertEquals(isValid(0, 23, appt.getStartHour()), appt.getValid());
					appt = new Appt(ValuesGenerator.getRandomIntBetween(random, this.diff, this.hour+37), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.minute), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.day), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.month), 
									ValuesGenerator.getRandomIntBetween(random, this.startyear, this.endyear),
									ValuesGenerator.getString(random), 
									ValuesGenerator.getString(random));
					assertEquals(isValid(0, 23, appt.getStartHour()), appt.getValid());
				}
				
				if(methodName.equals("minute")) {
					appt = new Appt(ValuesGenerator.getRandomIntBetween(random,1,this.hour),
									ValuesGenerator.getRandomIntBetween(random,this.diff,this.minute+31), 
									ValuesGenerator.getRandomIntBetween(random,1,this.day), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.month), 
									ValuesGenerator.getRandomIntBetween(random, this.startyear, this.endyear),
									ValuesGenerator.getString(random), 
									ValuesGenerator.getString(random));
					assertEquals(isValid(0, 59, appt.getStartMinute()), appt.getValid());

					appt = new Appt(ValuesGenerator.getRandomIntBetween(random, 1, this.hour), 
									ValuesGenerator.getRandomIntBetween(random, this.diff,this.minute+31), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.day), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.month), 
									ValuesGenerator.getRandomIntBetween(random, this.startyear, this.endyear),
									ValuesGenerator.getString(random), 
									ValuesGenerator.getString(random));
					assertEquals(isValid(0, 59, appt.getStartMinute()), appt.getValid());
				}
				
				if(methodName.equals("day")) {
					appt = new Appt(ValuesGenerator.getRandomIntBetween(random, 1, this.hour), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.minute), 
									ValuesGenerator.getRandomIntBetween(random, this.diff, this.day+30), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.month), 
									ValuesGenerator.getRandomIntBetween(random, this.startyear, this.endyear),
									ValuesGenerator.getString(random), 
									ValuesGenerator.getString(random));
					assertEquals(isValid(1, 31, appt.getStartDay()), appt.getValid());
					appt = new Appt(ValuesGenerator.getRandomIntBetween(random, 1, this.hour), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.minute), 
									ValuesGenerator.getRandomIntBetween(random, this.diff, this.day+30), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.month), 
									ValuesGenerator.getRandomIntBetween(random, this.startyear, this.endyear),
									ValuesGenerator.getString(random), 
									ValuesGenerator.getString(random));
					assertEquals(isValid(1, 31, appt.getStartDay()), appt.getValid());
				}

				if(methodName.equals("month")) {
					appt = new Appt(ValuesGenerator.getRandomIntBetween(random, 1, this.hour), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.minute), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.day), 
									ValuesGenerator.getRandomIntBetween(random, -12, this.month+12), 
									ValuesGenerator.getRandomIntBetween(random, this.startyear, this.endyear),
									ValuesGenerator.getString(random), 
									ValuesGenerator.getString(random));
					assertEquals(isValid(1, 12, appt.getStartMonth()), appt.getValid());
					appt = new Appt(ValuesGenerator.getRandomIntBetween(random, 1, this.hour), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.minute), 
									ValuesGenerator.getRandomIntBetween(random, 1, this.day), 
									ValuesGenerator.getRandomIntBetween(random, -100, -1), 
									ValuesGenerator.getRandomIntBetween(random, this.startyear, this.endyear),
									ValuesGenerator.getString(random), 
									ValuesGenerator.getString(random));
					assertEquals(isValid(1, 12, appt.getStartMonth()), appt.getValid());
				}
			}
			elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
			if ((iteration % 10000) == 0 && iteration != 0) System.out.println("elapsed time: " + elapsed + " of " + TestTimeout);
		
		}// end outside for loop
		System.out.println("Done testing...");
	}
}