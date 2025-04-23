public class PartA {
    public static void printInverted(int a) {
        if (a != 0) {
            for (int i = 0; i < a; i++) {
                System.out.print("*");
            }
            System.out.println();
            printInverted(a - 1);
        }
    }

    public static void main(String[] args) {
        printInverted(4);
    }
}