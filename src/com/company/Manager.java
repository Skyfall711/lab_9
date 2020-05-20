package com.company;

public class Manager extends Employee {
    double bonus;

    public Manager(String name,String surname,double bonus) {
        super(name,surname);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getSalary() {
        return this.salary + this.bonus;
    }

    public String toString(){
        return "Manager " + this.name + " " + this.surname + "( id - " + this.id + " )" + " have sal = " + this.salary + " and bonus = " + this.bonus;
    }
}