package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite a primeira nota: ");
        double firstGrade = header.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double secondGrade = header.nextDouble();
        
        double weightedAverage = (firstGrade * 2.5 + secondGrade * 4.5) / 2; 
        
        System.out.println("A média ponderada das notas é: " + weightedAverage + ".");
    }
}
