package employee;

import java.util.Objects;

/**
 * Create an `Employee` class which has private fields for
 * an employee's name and salary and appropriate getters,
 * setters, and constructors. Document the class with JavaDoc.
 */
public class Employee {
    private String name;
    private int salary;
    private int hourlyRate;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Sets the name of the manager
     * @param name the new name of the manager
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the manager
     * @return the name of the manager as a String
     */
    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    // @Override
    // public String toString() {
    //     return "name: " + this.name + ", salary:" + this.salary;
    // }

    public static void main(String[] args) {
        Employee e1 = new Employee("Manager1", 123);
        Employee e2 = new Employee("Manager1", 123);
        System.out.println(e1 == e2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1.equals(e2));
        // System.out.println(e1);
        // System.out.println(e1.toString());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) // Equal to null, we know its false instantly.
            return false;
        if (obj == this) // Equal to itself, we know its true instantly.
            return true;
        if (!obj.getClass().equals(this.getClass())) // Not the same class, we know its false instantly.
            return false;
        // At this point, we know its at least an Employee (meaning, Employee or any subclass of Employee)
        // subclass of employee => when a subclass calls this super.equals method

        Employee other = (Employee) obj;
        // Now we compare all the fields
        return Objects.equals(this.name, other.name) && Objects.equals(this.salary, other.salary);

        // NOTE: Objects.equals is best practice for comparing objects.
        // This is because it handles nulls properly.
        // If we were to use something like:
        // return this.name.equals(other.name) && this.salary == other.salary;
        // We would get a NullPointerException if this.name was null.
    }

}
