import java.util.ArrayList;

public class DemoInterface {
    public static void main(String[] args) {
        Animal a = new Animal("Bessie", 1000);
        Measurable m = a;
        System.out.println(m.getMeasure());

        BankAccount cryptoPortfolio = new BankAccount(123, -12345);
        m = cryptoPortfolio;
        System.out.println(m.getMeasure());

        // test static variable
        System.out.println(m.PI);

        // test static method
        ArrayList<Measurable> animals = new ArrayList<>();
        animals.add(a);
        a = new Animal("Bob", 1500);
        animals.add(a);

        System.out.println("The average animal weight = " + Measurable.calcAvg(animals));

        // testing comparable
        BankAccount savingsAccount = new BankAccount(1234, 1000);
        System.out.println("compareTo() returns " + savingsAccount.compareTo(cryptoPortfolio));

    }
}
