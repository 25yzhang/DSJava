/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 18 Part D
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Enter numbers or type 'q' to quit: ");

        Scanner in = new Scanner(System.in);
        boolean condition = true;

        while (condition) {
            if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                condition = false;
            } else {
                numbers.add(in.nextInt());
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                numbers.remove(i);
                i = i - 1;
            }
        }

        for (int j = 0; j < numbers.size(); j++) {
            System.out.println(numbers.get(j));
        }
    }
}
