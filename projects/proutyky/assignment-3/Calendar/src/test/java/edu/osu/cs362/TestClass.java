
//	Kyle Prouty
//	CS 362
//	Spring 2017
package edu.osu.cs362;

import org.junit.Test; 
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;


public class TestClass {
	
	Calendar calendar = Calendar.getInstance();

	@Test
	public void testAppt() throws Throwable {
		try{
			Appt appt = new Appt(11,
								00,
								this.calendar.get(Calendar.DAY_OF_MONTH),
								this.calendar.get(Calendar.MONTH),
								this.calendar.get(Calendar.YEAR),
								"Car Appt",
								"Oil Change");
			appt.toString();

			//Test Setters
			appt.setStartHour(12);
			appt.setStartMinute(45);
			appt.setStartDay(this.calendar.get(Calendar.DAY_OF_MONTH));
			appt.setStartMonth(this.calendar.get(Calendar.MONTH));
			appt.setStartYear(this.calendar.get(Calendar.YEAR));
			appt.setTitle(null);
			appt.setTitle("Changed Car Appt");
			appt.setDescription(null);
			appt.setDescription("Oil Change and Transmission flush");
			appt.toString();

			//Test Getters
			appt.getStartHour();
			appt.getStartMinute();
			appt.getStartDay();
			appt.getStartMonth();
			appt.getStartYear();
			appt.getTitle();
			appt.getDescription();
			appt.getValid();

			//Test isValid()
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
    public void testCalendar() throws Throwable {
    	try{
    		CalDay calday_invalid = new CalDay();

    		CalDay calday = new CalDay(new GregorianCalendar());
    		Appt appt_invalid = new Appt(100,
										 00,
										 this.calendar.get(Calendar.DAY_OF_MONTH),
										 this.calendar.get(Calendar.MONTH),
										 this.calendar.get(Calendar.YEAR),
										 "Car Appt",
										 "Oil Change");
    		calday.addAppt(appt_invalid);
    		
    		Appt appt_1 = new Appt(11,
								   00,
								   this.calendar.get(Calendar.DAY_OF_MONTH),
								   this.calendar.get(Calendar.MONTH),
								   this.calendar.get(Calendar.YEAR),
								   "Car Appt",
								   "Oil Change");
    		calday.addAppt(appt_1);
    		calday.addAppt(appt_1);

    		Appt appt_2 = new Appt(10,
								   00,
								   this.calendar.get(Calendar.DAY_OF_MONTH),
								   this.calendar.get(Calendar.MONTH),
								   this.calendar.get(Calendar.YEAR),
								   "Car Appt",
								   "Oil Change");
    		calday.addAppt(appt_2);

    		//Test Public Methods
    		calday_invalid.iterator();
    		calday.iterator();
    		calday.isValid();
    		calday.getAppts();
    		calday.getSizeAppts();
    		calday.getDay();
    		calday.getMonth();
    		calday.getYear();
    		calday.toString();
    		calday_invalid.toString();

    	}catch(Exception e){}
    }



	@Test
	public void testTimeTable() throws Throwable {
		try{

			TimeTable timetable = new TimeTable();

			CalDay calday = new CalDay(new GregorianCalendar());
    		Appt appt = new Appt(10,
								 00,
								 this.calendar.get(Calendar.DAY_OF_MONTH),
								 this.calendar.get(Calendar.MONTH),
								 this.calendar.get(Calendar.YEAR),
								 "Car Appt",
								 "Oil Change");

    		Appt appt_invalid = new Appt(100,
								 00,
								 this.calendar.get(Calendar.DAY_OF_MONTH),
								 this.calendar.get(Calendar.MONTH),
								 this.calendar.get(Calendar.YEAR),
								 "Car Appt",
								 "Oil Change");
    		
    		LinkedList<Appt> appt_list = new LinkedList<Appt>();
    		GregorianCalendar cur = new GregorianCalendar(this.calendar.get(Calendar.YEAR),
											    		  this.calendar.get(Calendar.MONTH),
											    		  this.calendar.get(Calendar.DAY_OF_MONTH));
    		GregorianCalendar next = (GregorianCalendar)cur.clone();
			next.add(Calendar.DAY_OF_MONTH,1);
    		
    		appt_list.add(appt);
    		appt_list.add(appt_invalid);

    		timetable.getApptRange(appt_list, cur, next);
    					
			timetable.deleteAppt(appt_list, appt);
			timetable.deleteAppt(appt_list, appt);
			timetable.deleteAppt(appt_list, appt_invalid);
			timetable.deleteAppt(null, appt);
			timetable.deleteAppt(appt_list, null);
			
			timetable.getApptRange(appt_list, next, cur);



		}catch(Exception e){}
	}



}