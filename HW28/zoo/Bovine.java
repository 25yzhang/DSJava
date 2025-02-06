package zoo;

public class Bovine extends Mammal {
    private double hayConsumed;

    public Bovine(String name, double weight) {
        super(name, weight);
    }

    public void feedHay(double pounds) {
        hayConsumed = hayConsumed + pounds;
    }

    public double getHayConsumed() {
        return hayConsumed;
    }

    public void printInfo() {
        System.out.printf("name : %s%nhay: %d%n", getName(), getHayConsumed());
    }
}
