import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        cakeCounter cakeCount = new cakeCounter();
        pieCounter pieCount = new pieCounter();
        Scanner in = new Scanner(System.in);

        boolean condition = true;

        while (condition == true) {
            System.out.print("Enter 'c' for cake, 'p' for pie, or 'q' to quit: ");
            if (in.hasNext("c") || in.hasNext("C")) {
                in.next();
                cakeCount.click();
            } else if (in.hasNext("p") || in.hasNext("P")) {
                in.next();
                pieCount.click();
            } else if (in.hasNext("q") || in.hasNext("Q")) {
                in.next();
                System.out.printf("Cake count = %d%nPie count  = %d%n", cakeCount.look(), pieCount.look());
                condition = false;
            } else {
                in.next();
                System.out.println("Enter 'c', 'p', or 'q' please.");
            }
        }
        in.close();
    }
}

class cakeCounter {
    /*
     * Construction.
     */
    public cakeCounter() {
        // initialize count to zero.
        pieCount = 0;
    }

    /*
     * Public Interface.
     */
    public int look() {
        return this.pieCount;
    }

    public void click() {
        this.pieCount = this.pieCount + 1;
        if (this.pieCount > MAX_COUNT) {
            this.pieCount = 0;
        }
    }

    public void reset() {
        this.pieCount = 0;
    }

    /*
     * Private member variables (used to model the state of the object).
     */
    private int pieCount = 0;
    private final int MAX_COUNT = 9999;

}

class pieCounter {
    /*
     * Construction.
     */
    public pieCounter() {
        // initialize count to zero.
        cakeCount = 0;
    }

    /*
     * Public Interface.
     */
    public int look() {
        return this.cakeCount;
    }

    public void click() {
        this.cakeCount = this.cakeCount + 1;
        if (this.cakeCount > MAX_COUNT) {
            this.cakeCount = 0;
        }
    }

    public void reset() {
        this.cakeCount = 0;
    }

    /*
     * Private member variables (used to model the state of the object).
     */
    private int cakeCount = 0;
    private final int MAX_COUNT = 9999;

}
