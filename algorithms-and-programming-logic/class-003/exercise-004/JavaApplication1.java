package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        float firstGrade = header.nextFloat();
        System.out.println("Digite a segunda nota: ");
        float secondGrade = header.nextFloat();
        
        float average = (firstGrade + secondGrade) / 2; 
        
        System.out.println("A média das notas é: " + average + ".");
    }
}
