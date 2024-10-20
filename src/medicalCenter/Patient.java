package medicalCenter;

import java.util.Date;

public class Patient extends Person{

    private Date registerDateTime;


    public Patient(String id, String name, String surName) {
        super(id, name, surName);
    }
}
