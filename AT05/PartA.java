/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * AT05 Part A
 */

//import the Random class
import java.util.Random;

public class PartA {
    public static void main(String[] args) {
        // create number variable of Random class, use new operator to create a new
        // instance of Random class
        Random number = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.print(number.nextInt(100) + ", ");
        }
    }
}