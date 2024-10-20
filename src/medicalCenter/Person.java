package medicalCenter;

public abstract class Person {
    private final String id;
    private final String name;
    private final String surName;

    protected Person(String id, String name, String surName) {
        this.id = id;
        this.name = name;
        this.surName = surName;
    }
}
