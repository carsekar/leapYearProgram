package leapYear;
import java.util.Calendar;

import bubbleSort_Revise.BubbleSort_Revise;

public class LeapYearPractice {
	
	public static void leapYear(int year)
	{
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		int noOfDays=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println(noOfDays);
		if(noOfDays > 365)
		{
			System.out.println("Its a leap year");
		}
		else
		{
			System.out.println("Its not a leap year");
		}
		
	}
	
	public boolean leapYearBool(int year)
	{
		
		return (year%400==0 || ((year%100!=0) && (year %4==0)));
		
	}
	
	public static void main(String [] args)
	{
		leapYear(2004);
		LeapYearPractice l=new LeapYearPractice();
		System.out.println(l.leapYearBool(2016));
	}
	
	

}
