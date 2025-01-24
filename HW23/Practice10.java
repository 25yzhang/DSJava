public class Practice10 {
    public static void main(String[] args) {

    }

    public static int Sum(int... values) {
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum = values[i] + sum;
        }
        return sum;
    }
}
