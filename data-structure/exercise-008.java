package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new scanner(System.in);
        
        double average = 0;
        
        for (int i = 0; i <= grades.length; i++) {
            double[i] grades = header.nextDouble();
            average += grades[i];
        }
        
        average /= grades.length;
        
        for (int i = 0; i <= grades.length; i++) {
            if (grades[i] >= average) {
                System.out.println(grades[i]);
            }
        }
    }
}
