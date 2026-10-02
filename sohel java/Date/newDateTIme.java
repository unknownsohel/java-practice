package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class newDateTIme {

    public static void main(String[] args) {

        LocalDate dateOnly = LocalDate.now();
        LocalTime timeOnly = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime dateTimeWithZone = ZonedDateTime.now();
        System.out.println(dateOnly);
        System.out.println(timeOnly);
        System.out.println(dateTime);
        System.out.println(dateTimeWithZone);

        LocalDate date = LocalDate.of(2026, 06, 22);
        LocalTime time = LocalTime.of(6, 01);
        LocalDateTime dateTime1 = LocalDateTime.of(2006, 06, 22, 6, 01, 12);
        ZoneId zoned = ZoneId.of("Asia/Calcutta");
        ZonedDateTime zone = ZonedDateTime.of(2006, 06, 22, 06, 01, 12, 15, zoned);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime1);
        System.out.println(zone);

    }

}
