package mow;

public class Yard {
    private char[][] yard;
    private int width;
    private int length;

    // constructor
    public Yard(int a, int b) {
        a = a + 2;
        b = b + 2;

        // width and length values flipped
        width = a;
        length = b;
        yard = new char[width][length]; // initialize yard

        // fill array with grass and bricks
        for (int i = 0; i < width; i++) { // set brick walls
            yard[i][0] = 'R'; // vertical walls
            yard[i][length - 1] = 'R';
        }
        for (int i = 0; i < length; i++) { // set brick walls
            yard[0][i] = 'R'; // horizontal walls
            yard[width - 1][i] = 'R';
        }

        for (int i = 1; i < width - 1; i++) { // set grass
            for (int j = 1; j < length - 1; j++) {
                yard[i][j] = '+';
            }
        }
    }

    public char returnStatus(int a, int b) {
        return yard[a][b];
    }

    public void cellOverride(int a, int b, char newValue) {
        yard[a][b] = newValue;
    }

    public int returnHeight() {
        return (width - 2);
    }

    public int returnWidth() {
        return (length - 2);
    }

    public void printYard() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(yard[i][j]);
            }
            System.out.println();
        }
    }
}