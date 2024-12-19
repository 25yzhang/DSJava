import java.time.LocalTime;
import java.time.LocalDate;

public class PartA {
    public static void main(String[] args) {
        LocalDate dateRightNow = LocalDate.now();
        LocalTime timeRightNow = LocalTime.now();

        System.out.printf("Today's date is %s%nThe time is %.15s", dateRightNow, timeRightNow);
    }
}
