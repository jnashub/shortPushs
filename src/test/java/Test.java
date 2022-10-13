import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        System.out.println(date().toString().substring(11, 24));
    }

    public static LocalDate localDate() {
        return LocalDate.now();
    }

    public static ZonedDateTime zonedDateTime() {
        return ZonedDateTime.now();
    }

    public static Date date() {
        Date date = new Date("12/10/2000");
        System.out.println(date.getDay() + "-" + date.getMonth() + "-" + date.getYear());
        return new Date("11/10/2000");
    }
}
