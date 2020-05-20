package com.company;

public class IncorrectSalaryException extends Exception {
    private double salary;
    public double getSalary()
    {
        return salary;
    }

    public IncorrectSalaryException(String message)
    {
        super(message);
    }
}