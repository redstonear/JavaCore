package medicalCenter;

public class Doctors extends Person{

    private String profession;

    public Doctors(String id, String name, String surName, String profession) {
        super(id, name, surName);
        this.profession = profession;
    }
}
