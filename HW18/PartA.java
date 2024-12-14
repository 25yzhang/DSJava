/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 18 Part A
 */

import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        System.out.println("Enter names or type '#' to quit: ");
        ArrayList<String> names = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        boolean condition = true;
        while (condition) {
            if (in.hasNext("#")) {
                in.next();
                condition = false;
            } else {
                names.add(in.next());
            }
        }

        for (int j = 0; j < names.size(); j++) {
            System.out.println(names.get(j));
        }
    }
}
