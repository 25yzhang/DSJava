public class PartB {
    public static void print(int[][] values) {
        int i = 0;
        for (i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length - 1; j++) {
                System.out.print(values[i][j] + ", ");
            }
            System.out.println(values[i][values[i].length - 1]);
        }
    }

    public static void main(String[] args) {
        int[][] arrayOne = {
                { 8, 6, 7 },
                { 5, 3, 0 }
        };
        int[][] arrayTwo = {
                { 0, 7, 6, 5 },
                { 2, 2, 0, 1 },
                { 8, 4, 5, 7 },
        };
        System.out.printf("First Array:%n");
        print(arrayOne);

        System.out.printf("%nSecond Array:%n");
        print(arrayTwo);
    }
}
