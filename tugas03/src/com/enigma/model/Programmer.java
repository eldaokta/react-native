package com.enigma.model;

public class Programmer extends Employee{
    private Integer bonus;

    public Programmer(Integer salary, Integer bonus){
        super(salary);
        this.bonus = bonus;
    }


    public Integer getnetSalary(){
        return salary+bonus;
    }
    public String toString() {
        return "Programmer{" +
                "salary" +salary+
                ", bonus=" + bonus +
                ", Net Salary="+NetSalary()+
                '}';
    }
}
