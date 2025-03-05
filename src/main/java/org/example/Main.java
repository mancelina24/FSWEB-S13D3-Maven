package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        Person person1 = new Person("John", "Doe", 20);
        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());

        Person person2=new Person("feyza", "Türkay",44,"Kadın",170,"fturkay@gmail");
        System.out.println("Firstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
    }


}
