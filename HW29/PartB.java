
public class PartB {
    public static void main(String[] args) {
        Employee Ed = new Employee("Ed", 50000);
        Manager Deidra = new Manager("Deidra", 65000, 7500);

        System.out.printf("%-10s: salary = $%,12.2f; annual income = $%,12.2f%n", Ed.getName(), Ed.getSalary(),
                Ed.getAnnualIncome());
        System.out.printf("%-10s: salary = $%,12.2f; annual income = $%,12.2f%n", Deidra.getName(),
                Deidra.getSalary(), Deidra.getAnnualIncome());
    }
}
