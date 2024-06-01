package net.javainfo.sortInterface.domain;


public class Manager extends Employee {


    public Manager(String name, Double salary) {
        super(name, salary);
    }

    public String getName() {
        return super.getName();
    }

    public Double getSalary() {
        return super.getSalary();
    }


}
