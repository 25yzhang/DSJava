/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW15 Part A
 */

import java.util.Arrays;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int list[] = new int[10];
        int current;
        System.out.println("Enter up to ten numbers or enter q to quit");
        for (current = 0; current < list.length; current++) {
            if (in.hasNext("Q") || in.hasNext("q")) {
                in.next();
                break;
            } else {
                list[current] = in.nextInt();
            }
        }

        // print original list
        System.out.print("*");
        for (int i = 0; i < current; i++) {
            System.out.print(list[i] + "*");
        }
        System.out.printf("%n");

        // create a copy of array
        int[] sortedList = Arrays.copyOf(list, current);
        Arrays.sort(sortedList);

        // print sorted
        System.out.print(sortedList[sortedList.length - 1]);
        for (int j = sortedList.length - 2; j >= 0; j--) {
            System.out.print(", " + sortedList[j]);
        }
    }
}
