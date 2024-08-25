import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>, Cloneable {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Implementing Comparable for natural sorting by id
    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    // Implementing clone method for deep cloning
    @Override
    protected Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}

// Custom Comparator for sorting by name
class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

// Custom Comparator for sorting by salary
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Double.compare(e1.getSalary(), e2.getSalary());
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(3, "Alice", 60000));
        employees.add(new Employee(1, "Bob", 50000));
        employees.add(new Employee(2, "Charlie", 55000));

        // Natural sorting by id (using Comparable)
        Collections.sort(employees);
        System.out.println("Employees sorted by ID (Natural Order):");
        displayEmployees(employees);

        // Sorting by name (using Comparator)
        Collections.sort(employees, new NameComparator());
        System.out.println("\nEmployees sorted by Name:");
        displayEmployees(employees);

        // Sorting by salary (using Comparator)
        Collections.sort(employees, new SalaryComparator());
        System.out.println("\nEmployees sorted by Salary:");
        displayEmployees(employees);

        // Cloning an employee
        Employee original = employees.get(0);
        Employee cloned = original.clone();
        System.out.println("\nCloned Employee: " + cloned);

        // Iterating over employees using Iterator
        System.out.println("\nIterating over Employees:");
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // Utility method to display employee list
    public static void displayEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
