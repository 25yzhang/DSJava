public class InClass {
    public static void main(String[] args) {
        String[][] chart = {
                { "Tamara", "Olivier", "Penny" },
                { "Reina", "John", "Courtney" },
                { "Hideki", "Rosy", "Elizabeth" },
                { "Stella", "Sawyer", "Hannah" }
        };

        for (int row = 0; row < chart.length; row++) {
            for (int col = 0; col < chart[0].length; col++) {
                System.out.print(chart[row][col]);
                // only print a comma if it's not the last column.
                if (col < chart[0].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}