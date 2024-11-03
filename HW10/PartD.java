/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW10
 */

public class PartD {
    public static void main(String[] args) {
        int times = 4;
        int spaces = 4;
        int printTimes = 1;
        for (int i = 1; i < 6; i++) {
            while (spaces > 0) {
                System.out.print(" ");
                spaces = spaces - 1;
            }
            while (printTimes > 0) {
                System.out.print(i);
                printTimes = printTimes - 1;
            }
            System.out.println("");
            printTimes = i + 1;
            spaces = times - 1;
            times = times - 1;
        }
    }
}
