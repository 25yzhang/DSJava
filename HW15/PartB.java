/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW15 Part B
 */

import java.util.Arrays;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int list[] = new int[20];
        int current;
        for (current = 0; current < list.length; current++) {
            System.out.print("Enter an integer value or 'q' to quit: ");
            if (in.hasNext("Q") || in.hasNext("q")) {
                in.next();
                break;
            } else {
                list[current] = in.nextInt();
            }
        }

        // print list
        System.out.print(list[0]);
        for (int i = 1; i < current; i++) {
            System.out.print(", " + list[i]);
        }
        System.out.printf("%n");

        System.out.print("Enter a target integer value: ");
        int target = in.nextInt();
        int count = 0;
        for (int j = 0; j < list.length; j++) {
            if (list[j] == target) {
                count = count + 1;
            }
        }

        System.out.printf("The value %d occurs %d times in your original data set.", target, count);
    }
}
