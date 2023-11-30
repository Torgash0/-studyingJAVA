package date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTest {
    public static void main(String[] args) {
        LocalDateTime happyBirthday = LocalDateTime.of(2003, 9, 26, 23, 45, 0);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(happyBirthday.getDayOfMonth() + "-" + happyBirthday.getMonthValue() + "-" + happyBirthday.getYear());
        System.out.println(happyBirthday.format(DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        System.out.println(localDateTime.minusYears(happyBirthday.getYear()).getYear());
        System.out.println(Duration.between(happyBirthday, localDateTime).toDays());
    }
}
