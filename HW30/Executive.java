public class Executive extends Manager {
    private double stocksOwned;

    public Executive(String name, double salary, double bonus, double stocksOwned) {
        super(name, salary, bonus);
        this.stocksOwned = stocksOwned;
    }

    public double getStocksOwned() {
        return stocksOwned;
    }

    public void setStocksOwned(double newStockAmount) {
        stocksOwned = newStockAmount;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.printf("  Stocks = $%,12.2f%n", stocksOwned);
    }
}
