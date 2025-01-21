import java.util.Arrays;

public class questionOne {
    public static void main(String[] args) {
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Swap(2, 7, numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void Swap(int a, int b, int[] numbers) {
        if (a > -1 && a < 10 && b > -1 && b < 10) {
            int placeholder = numbers[a];
            numbers[a] = numbers[b];
            numbers[b] = placeholder;
        } else {
            System.out.println("Enter values within the bounds (0-9)");
        }
    }
}