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
}
