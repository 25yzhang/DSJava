/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 14 Part B
 */

public class PartB {
    public static void main(String[] args) {
        double[] numbers = { 2.2, 1.0, 3.7, 4.1, 88.0 };
        double sum = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }
        System.out.println("Avg = " + (sum / i));
    }
}
