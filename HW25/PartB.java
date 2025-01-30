import java.util.ArrayList;
import java.util.Scanner;

class CashRegister {
    private double salesTotal;
    private ArrayList<Double> salesTracker = new ArrayList<Double>(); // could use seperate member variable here but I
                                                                      // chose to
    // simplify the code as
    // item count is synonymous with the size of the arraylist

    public CashRegister() {
        this.salesTotal = 0;
    }

    public void look() {
        System.out.printf("The total sales is %.2f and the item count is %d%n", salesTotal, salesTracker.size());
    }

    public void add(double a) {
        this.salesTotal = this.salesTotal + a;
        salesTracker.add(a);
    }

    public void deleteRecent() {
        if (!salesTracker.isEmpty()) {
            this.salesTotal = this.salesTotal - salesTracker.get(salesTracker.size() - 1);
        } else {
            System.out.println("There are currently no items recorded to delete.");
        }
        salesTracker.remove(salesTracker.size() - 1);
    }

    public void removeAll() {
        for (int i = 0; i < salesTracker.size(); i++) {
            salesTracker.remove(i);
        }
        this.salesTotal = 0;
    }

}

public class PartB {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        Scanner in = new Scanner(System.in);
        boolean condition = true;

        while (condition == true) {
            System.out.print(
                    "Enter a to add a value, t to display sales item count, d to delete most recent entry, c to clear sales, or q to quit the program: ");
            if (in.hasNext("a")) {
                in.next();
                System.out.print("What number would you like to add? ");
                register.add(in.nextDouble());
            } else if (in.hasNext("t")) {
                in.next();
                register.look();
            } else if (in.hasNext("d")) {
                in.next();
                register.deleteRecent();
            } else if (in.hasNext("c")) {
                in.next();
                register.removeAll();
            } else if (in.hasNext("q")) {
                in.next();
                condition = false;
            }
        }
        in.close();
    }
}