package net.javainfo.sortInterface.domain;

public class Employee implements Comparable<Employee> {

    private String name;
    private double salary;

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public int compareTo(Employee other) {
        if (this instanceof Manager && !(other instanceof Manager)) {
            return -1;
        } else if (!(this instanceof Manager) && other instanceof Manager) {
            return 1;
        }
        return Double.compare(salary, other.salary);
    }
}
