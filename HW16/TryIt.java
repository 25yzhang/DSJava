import java.util.Arrays;

public class TryIt {
    public static void square(double[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * values[i];
        }
    }

    public static void main(String[] args) {
        double[] list = { 1.0, 2.0, 3.0, 4.0, 5.0 };
        System.out.println(Arrays.toString(list));
        square(list);
        System.out.println(Arrays.toString(list));
    }
}
