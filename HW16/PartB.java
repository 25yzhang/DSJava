/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 16 Part B
 */

public class PartB {
    public static double average(double... values) {
        double total = 0;
        int i = 0;
        for (i = 0; i < values.length; i++) {
            total = total + values[i];
        }
        double average = total / (i);
        return average;
    }

    public static void main(String[] args) {
        System.out.println(average(10, 8, 10));
        double[] scores = { 100, 90, 80, 100, 80 };
        System.out.println(average(scores));
    }
}
