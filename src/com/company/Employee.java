package com.company;

public class Employee {
    protected int id;
    protected static int nextId;
    protected String name;
    protected String surname;
    protected double salary = 1000;
    protected Manager manager;

    public Employee(String name,String surname) {
        this.nextId++;
        this.id = this.nextId;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws FieldLengthLimitException{
        if(name.length()>5) throw new FieldLengthLimitException("Name is too long");
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) throws FieldLengthLimitException{
        if(surname.length()>5) throw new FieldLengthLimitException("Surname is too long");
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws IncorrectSalaryException{
        if(salary<0) throw new IncorrectSalaryException("Salary is incorect");
        this.salary = salary;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
    public final void raiseSalary(double p){
        this.salary = this.salary*(100+p)/100;
    }
    public String toString(){
        return "Employee " + this.name + " " + this.surname + "( id - " + this.id + " )" + " have sal = " + this.salary;
    }

    public void getManagerName(){
        if(manager == null) {
            System.out.println("No Manager ");
        }else {
            System.out.println(this.getManager().getName());
        }
    }

    public Employee getTopManager(Manager manager){
        if(manager == null) {
            return this;
        }else {
            return manager.getTopManager(manager.getManager());
        }
    }
}
