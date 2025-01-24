public class PartB {
    public static int getInt() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

    public static void main(String[] args) {
        System.out.println(getInt());
    }

}
// because the finally block will always run, through it initially returns 1 as
// the output of the getInt() method, the return 3 in the finally block
// overrides that initial returned value, making the output always 3