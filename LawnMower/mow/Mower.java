package mow;

public class Mower {
    // member variables representing row and column
    private int row;
    private int column;
    private int direction;
    final int MAX_DIRECTION = 3;

    // constructor, default position = (0,0), pointing to the right
    public Mower() {
        row = 0;
        column = 0;
        direction = 1;
    }

    // overloaded constructor, with set position and direction
    public Mower(int row, int column, int direction) {
        this.row = row;
        this.column = column;
        this.direction = direction;
    }

    // return row and column
    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    // set row and column
    public void setRow(int newRow) {
        row = newRow;
    }

    public void setColumn(int newColumn) {
        column = newColumn;
    }

    // set and get direction
    public int getDirection() {
        return direction;
    }

    public void setDirection(int newDirection) {
        if (newDirection <= MAX_DIRECTION) {
            direction = newDirection;
        }
    }

    // movement methods: move forward, turn left/right
    public void moveForward() {
        if (direction == 0) {
            row = row - 1;
        } else if (direction == 1) {
            column = column + 1;
        } else if (direction == 2) {
            row = row + 1;
        } else if (direction == 3) {
            column = column - 1;
        }
    }

    // detect grass one pixel in front of mower
    public boolean detectGrass(Yard yard) {
        if (direction == 0) {
            if (yard.returnStatus(row - 1, column) == '+') {
                return true;
            } else {
                return false;
            }
        } else if (direction == 1) {
            if (yard.returnStatus(row, column + 1) == '+') {
                return true;
            } else {
                return false;
            }
        } else if (direction == 2) {
            if (yard.returnStatus(row + 1, column) == '+') {
                return true;
            } else {
                return false;
            }
        } else if (direction == 3) {
            if (yard.returnStatus(row, column - 1) == '+') {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void cutGrass(Yard yard) {
        yard.cellOverride(row, column, ' ');
    }

    public void randomCorner(Yard yard) {
        int randomCorner = (int) (3 * Math.random());
        int randomDirection = (int) (1 * Math.random());

        if (randomCorner == 0) { // top left corner
            column = 0;
            row = 0;
            if (randomDirection == 1) {
                direction = 1;
            } else if (randomDirection == 2) {
                direction = 2;
            }
        } else if (randomCorner == 1) { // top right corner
            row = 0;
            column = yard.returnWidth() - 1;
            if (randomDirection == 0) {
                direction = 2;
            } else if (randomDirection == 1) {
                direction = 3;
            }
        } else if (randomCorner == 2) { // bottom left corner
            column = 0;
            row = yard.returnHeight() - 1;
            if (randomDirection == 0) {
                direction = 1;
            } else if (randomDirection == 1) {
                direction = 2;
            }
        } else if (randomCorner == 3) { // bottom right corner
            row = yard.returnHeight() - 1;
            column = yard.returnWidth() - 1;
            if (randomDirection == 0) {
                direction = 1;
            } else if (randomDirection == 3) {
                direction = 2;
            }
        }
    }

    public boolean updateMower(Yard yard) {
        for (int r = 0; r < yard.returnHeight(); r++) {
            for (int c = 0; c < yard.returnWidth(); c++) {
                if (yard.returnStatus(r, c) == '+') {
                    // move row and column to align mower
                    while (r < row) {
                        direction = 0;
                        moveForward();
                    }
                    while (r > row) {
                        direction = 2;
                        moveForward();
                    }
                    while (c < column) {
                        direction = 3;
                        moveForward();
                    }
                    while (c > column) {
                        direction = 1;
                        moveForward();
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
