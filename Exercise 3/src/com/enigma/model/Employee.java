package com.enigma.model;

public class Employee {
    protected Integer salary;

    public Employee(Integer salary){
        this.salary = salary;
    }

    public Integer NetSalary(){
        return salary;
    }

    public String print() {
        return "Employee{" +
                "salary=" + salary +
                '}';
    }
}

