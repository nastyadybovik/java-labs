import sun.util.resources.CalendarData;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by dom on 14.02.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Started:");
        System.out.println("Name: " + args[0]);
        System.out.println(args[1] + " " + args[2] + " " + args[3] + " " + args[4]);
        System.out.println("Finished:");
        GregorianCalendar calendar = new GregorianCalendar();
        Date hireDay = calendar.getTime();
        System.out.println(hireDay);
    }
}
