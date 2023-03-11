package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        float grades[] = new float[5];
        float average = 0;
        
        System.out.println("Digite as notas: ");
        
        for (int i = 0; i < grades.length; i++) {
            grades[i] = header.nextFloat();
            
            average += grades[i];
        }
        
        average /= grades.length;
        
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > average) {
                System.out.println(grades[i]);
            }
        }
    }
}
