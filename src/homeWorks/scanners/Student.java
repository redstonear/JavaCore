package homeWorks.scanners;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String lessonName;

    public Student(String name, String surname, int age, String phoneNumber, String lessonName) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.lessonName = lessonName;
    }

    public Student() {
    }

    public String getName(String s) {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getSurname(String s) {
    }

    public void getAge(int i) {
    }

    public void getPhoneNumber(String s) {
    }

    public void getLessonName(String s) {
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Lesson Name: " + lessonName);
    }
}
