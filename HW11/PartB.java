/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW11 Part B
*/

public class PartB {
    public static double mystery(double x, double y) {
        double result = (x + y) / (y - x);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(mystery(3, 2));
        // result is -5.0
    }
}
