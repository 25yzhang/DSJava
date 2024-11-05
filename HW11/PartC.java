import java.util.Scanner;

public class PartC {
    public static double volume(double x) {
        double result = (4 / 3.0) * Math.PI * x * x * x;
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        double radius = in.nextDouble();
        System.out.printf("The volume is %.2f", volume(radius));

    }
}
