package by.bsu.lesson_2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by dom on 21.02.2015.
 */
public class Developer {
    /**
     * Prints information about developer, date when work started and finished
     * @param args use for print information about developer.
     * @see by.bsu.lesson_2
     */
    static public void infodevelop(String [] args){
        System.out.println("STARTED:");
        System.out.println("Name: " + args[0]);
        System.out.println(args[1] + " " + args[2] );
        System.out.println("FINISHED:");
        Calendar c =  Calendar.getInstance(TimeZone.getTimeZone("Europe/Minsk"));
        System.out.println(c.getTime());
    }
}
