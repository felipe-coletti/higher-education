package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new.Triangle(2.5, 3);

        float a = (triangle.b * triangle.h) / 2;

        System.out.println("Área: " + a);

        Date date = new.Date(2015, 9, 2);

        System.out.println(date.year + "/" + date.month + "/" + date.day);
    }
}
