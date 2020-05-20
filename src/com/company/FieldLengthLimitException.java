package com.company;

public class FieldLengthLimitException extends Exception {
    private String name;
    private String surname;
    public String getName()
    {
        return name;
    }
    public String getSurname()
    {
        return surname;
    }
    public FieldLengthLimitException(String message)
    {

        super(message);
    }
}
