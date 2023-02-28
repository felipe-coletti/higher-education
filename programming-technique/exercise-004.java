package javaapplication1;

public class person {
    String name;
    int age;
    double income;
}

public person() {
    System.out.println("Objeto construído");
}

public person(String name, int age, double income) {
    this.name = name;
    this.age = age;
    this.income = income;
}
