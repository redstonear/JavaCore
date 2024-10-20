package homeWorks.scanners;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        System.out.println("Enter your name: ");
        student.getName(scanner.nextLine());
        System.out.println("Enter your surname: ");
        student.getSurname(scanner.nextLine());
        System.out.println("Enter your age: ");
        student.getAge(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter your phone number: ");
        student.getPhoneNumber(scanner.nextLine());
        System.out.println("Enter your lesson name: ");
        student.getLessonName( scanner.nextLine());
        System.out.println("Thank you " + student.getName("") + ". You have registered successfully!");
        student.print();
    }
}