public class Counter {
    /*
     * Construction.
     */
    public Counter() {
        // initialize count to zero.
        this.count = 0;
    }
    /*
     * Public Interface.
     */
    public int look() {
        return count;
    }

    public void click() {
        this.count = this.count + 1;
        if (this.count > MAX_COUNT) {
            this.count = 0;
        }
    }

    public void reset() {
        this.count = 0;
    }
    /*
     * Private member variables (used to model the state of the object).
     */
    private int count = 0;
    private final int MAX_COUNT = 9999;
    public static void main (String[] args) {

    }
}