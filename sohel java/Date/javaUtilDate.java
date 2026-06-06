package Date;

import java.util.Date;

public class javaUtilDate {
    public static void main(String[] args) {
        Date currentDate = new Date();// current date and time value
        System.out.println(currentDate);
        long time = currentDate.getTime();// milliseconds till now from year 1900
        System.out.println(time);

        Date futureDate = new Date(106, 5, 22, 6, 1, 25);
        System.out.println(futureDate);

        long sec = 775636789;

        Date date = new Date(sec);
        System.out.println(date);
    }

}
