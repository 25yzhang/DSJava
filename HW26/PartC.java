/*
 * Jerry Zhang
 * Mr. Eng
 * AT Java
 * HW 26 PartB
 */

class Customer {
    private String companyName;
    private double totalSales;
    private int numberSales;
    private int regionCode;
    private int serialNumber;
    public static int lastSerialUsed = 0;

    public Customer(String name, int regionCode) {
        companyName = name;
        totalSales = 0;
        numberSales = 0;
        this.regionCode = regionCode;

        lastSerialUsed++;
        serialNumber = lastSerialUsed;
    }

    public Customer(String name) {
        companyName = name;
    }

    public String getName() {
        return companyName;
    }

    public void setName(String new_name) {
        companyName = new_name;
    }

    public void setRegion(int new_region) {
        regionCode = new_region;
    }

    public int getRegion() {
        return regionCode;
    }

    public void addSale(double amount) {
        totalSales += amount;
    }

    public double getSales() {
        return totalSales;
    }

    public int getNumber() {
        return numberSales;
    }

    public double getAverage() {
        return (totalSales / numberSales);
    }

}

public class PartC {
    public static void main(String[] args) {
        Customer.lastSerialUsed = 100;
        Customer c1 = new Customer("Sal's Deli");
        c1.addSale(100);
        Customer c2 = c1;
        c2.addSale(50);
        System.out.println(c1.getSales());
        System.out.println(c2.getSales());
    }
}

// because customer isn't a primitive data type, when setting c2 equal to c1, it
// simply shares the address of the customer object rather than making a copy of
// it. Therefore, it will add 100 and 50 to both, making it print 150 twice