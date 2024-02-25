/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * AT06
 */

import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;

public class Calendar {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // get month
        Month month = today.getMonth();

        // get spaces to format print month
        int numberOfSpaces = (27 - month.toString().length()) / 2;

        // print number of spaces
        for (int i = numberOfSpaces; i > 0; i--) {
            System.out.print(" ");
        }

        // print month
        System.out.println(month);

        // print weeks
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        // get day of week
        DayOfWeek firstDay = today.withDayOfMonth(1).getDayOfWeek();

        // declare number of days in month
        int numberOfDays = today.lengthOfMonth();

        // declare day of month to print
        int printDay = 0;

        // print spaces needed for each first day
        if (firstDay == DayOfWeek.MONDAY) {
            for (int i = 1; i <= 7; i++) {
                if (i == today.getDayOfMonth()) {
                    System.out.printf("%3d*", i);
                } else {
                    System.out.printf("%3d ", i);
                }
                numberOfDays = numberOfDays - 1;
                printDay = i;
            }
        } else if (firstDay == DayOfWeek.TUESDAY) {
            System.out.print("    ");
            for (int i = 1; i <= 6; i++) {
                if (i == today.getDayOfMonth()) {
                    System.out.printf("%3d*", i);
                } else {
                    System.out.printf("%3d ", i);
                }
                numberOfDays = numberOfDays - 1;
                printDay = i;
            }
        } else if (firstDay == DayOfWeek.WEDNESDAY) {
            System.out.print("        ");
            for (int i = 1; i <= 5; i++) {
                if (i == today.getDayOfMonth()) {
                    System.out.printf("%3d*", i);
                } else {
                    System.out.printf("%3d ", i);
                }
                numberOfDays = numberOfDays - 1;
                printDay = i;
            }
        } else if (firstDay == DayOfWeek.THURSDAY) {
            System.out.print("            ");
            for (int i = 1; i <= 4; i++) {
                if (i == today.getDayOfMonth()) {
                    System.out.printf("%3d*", i);
                } else {
                    System.out.printf("%3d ", i);
                }
                numberOfDays = numberOfDays - 1;
                printDay = i;
            }
        } else if (firstDay == DayOfWeek.FRIDAY) {
            System.out.print("                ");
            for (int i = 1; i <= 3; i++) {
                if (i == today.getDayOfMonth()) {
                    System.out.printf("%3d*", i);
                } else {
                    System.out.printf("%3d ", i);
                }
                numberOfDays = numberOfDays - 1;
                printDay = i;
            }
        } else if (firstDay == DayOfWeek.SATURDAY) {
            System.out.print("                    ");
            for (int i = 1; i <= 2; i++) {
                if (i == today.getDayOfMonth()) {
                    System.out.printf("%3d*", i);
                } else {
                    System.out.printf("%3d ", i);
                }
                numberOfDays = numberOfDays - 1;
                printDay = i;
            }
        } else if (firstDay == DayOfWeek.SUNDAY) {
            System.out.print("                        ");
            for (int i = 1; i <= 1; i++) {
                if (i == today.getDayOfMonth()) {
                    System.out.printf("%3d*", i);
                } else {
                    System.out.printf("%3d ", i);
                }
                numberOfDays = numberOfDays - 1;
                printDay = i;
            }
        }

        // update current day to print
        printDay = printDay + 1;
        System.out.println("");

        int totalDaysInMonth = today.lengthOfMonth();
        for (int i = numberOfDays; i > 0; i = i - 7) {
            for (int j = 0; j < 7; j++) {
                if (printDay > totalDaysInMonth) {
                    System.out.println("");
                    break;
                }
                if (printDay == today.getDayOfMonth()) {
                    System.out.printf("%3d*", printDay);
                } else {
                    System.out.printf("%3d ", printDay);
                }
                numberOfDays = numberOfDays - 1;
                printDay = printDay + 1;
            }
            System.out.println("");
        }
    }
}
