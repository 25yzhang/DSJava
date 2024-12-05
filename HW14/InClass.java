import java.util.Scanner;

public class InClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] array = new int[5];
        int biggest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a value: ");
            array[i] = in.nextInt();
            System.out.print(array[i]);
            if (array[i] > biggest) {
                biggest = array[i];
                System.out.print("* ");
            } else {
                System.out.print(" ");
            }
        }
        System.out.printf("%n%d is the biggest", biggest);
    }
}