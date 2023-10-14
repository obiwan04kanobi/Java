package Java_programs.Collections;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class date_time_2 {
    public static void main(String[] args) {
/*         LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);
 */
        LocalDateTime dt = LocalDateTime.now(); // This is the date
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/mm/yyyy"); // This is the format (which could be anything of your choice)
        String mydate = dt.format(df);
        System.out.println(mydate);

        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE; //predefined date format 
        String mydate2 = dt.format(df2);
        System.out.println(mydate2);

        DateTimeFormatter df3 = DateTimeFormatter.ofPattern("dd/mm/yyyy (H:m) a --E"); // "E" will also print the day of the week, "a" will print AM/PM and "H:m" will print the time along with the date.
        String mydate3 = dt.format(df3);
        System.out.println(mydate3);

    }
}
