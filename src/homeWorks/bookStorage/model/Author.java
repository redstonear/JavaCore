package homeWorks.bookStorage.model;

import java.util.Date;

public class Author {
    private String id;
    private String name;
    private String surname;
    private int phone;

    public Author(String id, String name, String surname, int phone, Date dateOfBirthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
    }
}
