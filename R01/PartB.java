public class PartB {
    public static void printTriangle(int totalHeight, int startingWidth) {
        if (totalHeight != 0) {
            for (int i = 1; i <= startingWidth; i++) {
                System.out.print("*");
            }
            System.out.println();
            printTriangle(totalHeight - 1, startingWidth + 1);
        }
    }

    public static void main(String[] args) {
        printTriangle(5, 1);
    }
}
