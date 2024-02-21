package employee;

import java.time.LocalDate;

/**
 * Create a `Manager` class that is a subclass of `Employee`
 * and has a field for the manager's hire date.
 */
public class Manager extends Employee {
    private LocalDate hireDate;

    public Manager(String name, int salary, LocalDate hireDate) {
        super(name, salary);
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString() + ", hireDate: " + this.hireDate;
        // return "name: " + this.getName() + ", salary:" + this.getSalary() + ", hourWage: " + ", hireDate: " + this.hireDate;
    }

    public static void main(String[] args) {
        Manager m1 = new Manager("hello", 1, LocalDate.now());
        System.out.println(m1);
        System.out.println("hello" == new String("hello"));
        System.out.println(new String("hi").equals("hi"));
    }
}
