import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class SerializationRead {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filepath = in.next();

        ArrayList<Employee> employees = new ArrayList<Employee>();

        try (
                FileInputStream fileInputStream = new FileInputStream(filepath);
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);) {
            Employee.lastIDUsed = dataInputStream.readInt();
            while (dataInputStream.available() > 0) {
                Employee newEmployee = Employee.readFromStream(dataInputStream);
                employees.add(newEmployee);
            }
        } catch (Exception e) {
            System.err.println("doesnt work!");
            in.close();
            return;
        }

        for (Employee employee : employees) {
            employee.displayInfo();
        }
        in.close();
    }
}
