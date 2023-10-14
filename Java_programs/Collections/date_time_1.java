package Java_programs.Collections;
//import java.util.Date; // deprecated from java 8 onwards
import java.util.*; // Calender class is an abstract class
import java.util.TimeZone;
public class date_time_1 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        
        System.out.println("How many years have passed since 1970: "+System.currentTimeMillis()/1000/3600/24/365);

/*         // Deprecated methods
        Date d = new Date();
        System.out.println("Current Date and Time: "+d);
        System.out.println(d.getDate()); //return current date of the month (deprecated)
        System.out.println(d.getSeconds()); //(deprecated)
        System.out.println(d.getYear()); //(deprecated) */
/* 
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID()); */

/*         Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Greenwich Mean Time")); 
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID()); */

/*         Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));   //returns the current date of the month
        System.out.println(c.get(Calendar.SECOND)); //returns the current seconds in a minute
        System.out.println(c.get(Calendar.HOUR));   //returns the current hours passed since 12 AM in morning
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println("TIME: "+ c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND)); */

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2023)); //is the year entered a leap year or not ?
        System.out.println(gc.isLeapYear(2016)); //is the year entered a leap year or not ?
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[67]);
        System.out.println(TimeZone.getAvailableIDs()[200]);
        
    }
}
