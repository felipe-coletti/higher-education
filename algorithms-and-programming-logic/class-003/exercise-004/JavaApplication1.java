package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double firstGrade = header.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double secondGrade = header.nextDouble();
        
        double average = (firstGrade + secondGrade) / 2; 
        
        System.out.println("A média das notas é: " + average + ".");
    }
}
