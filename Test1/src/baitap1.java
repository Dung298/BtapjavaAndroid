import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class baitap1 {
    private static List<Employee> employees=new ArrayList<>();
    private static int nextId = 1;
    public static void main(String[] args) {
        initializeEmployees();
        displayEmployees();
        addEmployee();
        displayEmployees();
        removeEmployee();
        displayEmployees();
    }
        private static void initializeEmployees() {
            for (int i = 0; i < 10; i++) {
                employees.add(new Employee(nextId++, "Employee" , 25 + i, "Department" , "Code" , 1000.0 + i * 100));
            }
        }
        private static void displayEmployees() {
            System.out.println("List of Employees:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
            System.out.println();
        }

        private static void addEmployee() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // Consume newline character
            System.out.print("Department: ");
            String department = scanner.nextLine();
            System.out.print("Code: ");
            String code = scanner.nextLine();
            System.out.print("Salary Rate: ");
            double salaryRate = scanner.nextDouble();

            employees.add(new Employee(nextId++, name, age, department, code, salaryRate));
            System.out.println("Employee added successfully.");
            System.out.println();
        }

        private static void removeEmployee() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter employee ID to remove: ");
            int idToRemove = scanner.nextInt();

            boolean removed = employees.removeIf(employee -> employee.getId() == idToRemove);
            if (removed) {
                System.out.println("Employee removed successfully.");
            } else {
                System.out.println("Employee with ID " + idToRemove + " not found.");
            }
            System.out.println();
        }
    }

