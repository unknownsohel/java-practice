package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatingDemo {
    public static void main(String[] args) throws ParseException {

        Date currentDate = new Date();
        System.out.println(currentDate);
        SimpleDateFormat Dateformate = new SimpleDateFormat("yyyy-MMMM-dd HH:mm:ss");
        String formattedDate = Dateformate.format(currentDate);
        System.out.println(formattedDate);

        SimpleDateFormat Dateformate1 = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate1 = Dateformate1.format(currentDate);
        System.out.println(formattedDate1);

        String dateString = "2026-06-1 10:30:00";
        SimpleDateFormat Dateformate2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate = Dateformate2.parse(dateString);
        System.out.println(parsedDate);

    }

}
