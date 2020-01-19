package leapYear;
import java.util.Calendar;

public class LeapYear {
	
	public static boolean isLeapYear(int year)
	{
		Calendar calendar=Calendar.getInstance();
		calendar.set(Calendar.YEAR,year);
		int noOfDays=calendar.getActualMaximum(Calendar.DAY_OF_YEAR);
		if(noOfDays >365)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
		
	}
	
	public static void main(String [] args)
	{
		
		boolean bool=false;
		int year=1000;
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					bool=true;
				}
				else
				{
					bool=false;
				}
				
			}
			else
			{
				bool=true;
			}		
			
		}
		else
		{
			bool=false;
		}
		System.out.println(bool);
		System.out.println(isLeapYear(3000));
	}
	

}
