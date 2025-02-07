package mow;

public class Yard {
    private char[][] yard;
    private int length;
    private int width;

    // constructor
    public Yard(int a, int b) {
        a = a + 2;
        b = b + 2;

        // width and length values flipped... (width, height)
        length = a;
        width = b;
        yard = new char[length][width]; // initialize yard

        // fill array with grass and bricks
        for (int i = 0; i < length; i++) { // set brick walls
            yard[i][0] = 'R'; // vertical walls
            yard[i][width - 1] = 'R';
        }
        for (int i = 0; i < width; i++) { // set brick walls
            yard[0][i] = 'R'; // horizontal walls
            yard[length - 1][i] = 'R';
        }

        for (int i = 1; i < length - 1; i++) { // set grass
            for (int j = 1; j < width - 1; j++) {
                yard[i][j] = '+';
            }
        }
    }

    public char returnStatus(int length, int width) {
        return yard[length + 1][width + 1];
    }

    public void cellOverride(int row, int column, char newValue) {
        yard[row + 1][column + 1] = newValue;
    }

    public int returnHeight() {
        return (length - 2);
    }

    public int returnWidth() {
        return (width - 2);
    }

    // print function
    public void printYard(Mower mower) {
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < width; column++) {
                if (row == mower.getRow() + 1 && column == mower.getColumn() + 1) {
                    if (mower.getDirection() == 0) {
                        System.out.print("↑");
                    } else if (mower.getDirection() == 1) {
                        System.out.print("→");
                    } else if (mower.getDirection() == 2) {
                        System.out.print("↓");
                    } else if (mower.getDirection() == 3) {
                        System.out.print("←");
                    }
                } else {
                    System.out.print(yard[row][column]);
                }
            }
            System.out.println();
        }
    }
}