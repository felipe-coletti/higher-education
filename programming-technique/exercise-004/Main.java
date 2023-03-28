package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("João", 25, 1000);

        System.out.println("Nome: " + person.name);
        System.out.println("Idade: " + person.age);
        System.out.println("Renda: " + person.income);
    }
}
