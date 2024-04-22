import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private  String code;
    private Double salary_rate;
    public Employee (int id,String name, int age,String department,String code,Double salary_rate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.department=department;
        this.code=code;
        this.salary_rate=salary_rate;
    }
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", code='" + code + '\'' +
                ", salaryRate=" + salary_rate +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSalary_rate(Double salary_rate) {
        this.salary_rate = salary_rate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getCode() {
        return code;
    }

    public Double getSalary_rate() {
        return salary_rate;
    }
    public class EmployeeManagementSystem {
        private static List<Employee> employees= new ArrayList<>();
        private static int nextId = 1;
        private static void initializeEmployees() {
            for (int i = 0; i < 10; i++) {
                employees.add(new Employee(nextId++, "Employee" + i, 25 + i, "Department" + (i % 3), "Code" + i,  +1000.0+i*100.0  ));
            }
        }

    }
}


