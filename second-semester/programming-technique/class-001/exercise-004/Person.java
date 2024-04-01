package javaapplication1;

public class Person {
    String name;
    int age;
    double income;
}

public Person() {
    System.out.println("Objeto construído.");
}

public Person(String name, int age, double income) {
    this.name = name;
    this.age = age;
    this.income = income;
}
