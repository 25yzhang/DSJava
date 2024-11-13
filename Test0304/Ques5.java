/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * Test0304 Question 5
 */

public class Ques5 {
    public static void main(String[] args) {
        int total = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            total = total + i;
            count = count + 1;
        }
        double average = (double) total / count;
        System.out.println("The average of all integers from 1 to 100 is " + average);
    }
}