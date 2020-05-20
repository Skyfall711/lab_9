package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IncorrectSalaryException, FieldLengthLimitException {
        Manager manager1 = new Manager("John","Smith",100);
        Manager manager2 = new Manager("Blake","Lex",150);
        Employee employee1 = new Employee("Alex","Lot");
        Employee employee2 = new Employee("Nick","Ball");
        Employee employee3 = new Employee("Harry","Potter");
        Manager manager3 = new Manager("Ricardo","Terra",200);
        Manager manager4 = new Manager("Den","Wix",250);
        Manager manager5 = new Manager("Lisa","Perry",300);
        Manager manager6 = new Manager("Johny","Cage",400);
        Employee employee4 = new Employee("Kong","Lao");
        manager2.setManager(manager1);
        employee1.setManager(manager2);
        employee2.setManager(manager2);
        employee3.setManager(manager1);
        manager4.setManager(manager3);
        manager5.setManager(manager4);
        manager6.setManager(manager5);
        employee4.setManager(manager6);

        Scanner in = new Scanner(System.in);
        Employee employee8 = new Employee("Denny","Potter");
        System.out.println("Please enter name : ");
        String name = in.nextLine();
        System.out.println("Please enter surname : ");
        String surname = in.nextLine();
        System.out.println("Please enter salary : ");
        Double salary = in.nextDouble();

        employee8.setName(name);
       
        employee8.setSurname(surname);

        employee8.setSalary(salary);



    }
}
