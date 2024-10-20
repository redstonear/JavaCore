package oldCode;

import java.util.Objects;

public class Animal extends Object {
    String name;

    int age;

    public static void main(String[] args) {
        Animal animal1 = new Animal();


        Animal animal2 = new Animal();


        Animal dog = new Animal();
        Animal cat = new Animal();
        dog.makeSound();
        cat.makeSound();


        animal1.name = "Barni";

        animal2.name = "Pablo";

        animal1.age = 12;
        animal2.age = 12;

        int x = 7;

        System.out.println(animal1.toString());
        System.out.println(animal1.name.equals(animal2.name));
    }

    void makeSound() {
        System.out.println("MEOW");
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    void eat() {
        System.out.println("I eat");
    }

    void drink() {
        System.out.println("I drink");
    }
}


class Cat extends Animal {

    double weight;

    public static void main(String[] args) {
        Cat tom = new Cat();
        tom.age = 12;
        tom.name = "tom";
        tom.weight = 5;
        tom.drink();
        tom.eat();
    }

    @Override
    public void eat() {
        System.out.println("Cat is eat");
    }

    @Override
    void drink() {
        System.out.println("Cat is drink");
    }
}

class Kitty extends Cat {

    String owner;

    public static void main(String[] args) {
        Kitty kitty = new Kitty();
        kitty.owner = "Jack";
        System.out.println(kitty.owner);   // JAck
        System.out.println(kitty.weight);  // 0.0
        System.out.println(kitty.name);    // null
        System.out.println(kitty.age);     // 0
        Animal animal = new Animal();
    }
}


//class Dddd {
//    public static void main(String[] args) {
//        double x = 5.0;
//        double y = 3.0;
//
//        double a = 7.0;
//        double b = 5.0;
//
//        double xy = x / y;
//        double ab = a / b;
//
//        System.out.println(xy);
//        System.out.println(ab);
//    }
//}


//class Human_ {
//
//    String name;
//    String profession;
//
//    public void eat(String value) {
//        System.out.println(value);
//    }
//
//    public void drink(String value) {
//        System.out.println(value);
//    }
//
//}

//class Teacher extends Human_ {
//    public String subject;
//
//
//    @Override
//    public void drink(String value) {
//        System.out.println(value);
//    }
//}

//class Programmer extends Human_ {
//
//    public int salary;
//
//    public static void main(String[] args) {
//        Programmer programmer = new Programmer();
//        programmer.eat("Pizza");
//
//        Teacher teacher = new Teacher();
//        teacher.name = "Rose";
//        teacher.subject= "English";
//        teacher.profession = "Mankavarj";
//
//        programmer.profession = "Programmer";
//        programmer.name= "Jack";
//        programmer.salary = 3000;
//
//        teacher.drink("Coffee");
//
//    }
//
//    @Override
//    public void eat(String value) {
//        System.out.println("PIZZA");
//    }
//
//}