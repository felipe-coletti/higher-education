package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite um texto: ");
        String firstText = header.next();
        System.out.println("Digite um número inteiro: ");
        int firstNumber = header.nextInt();
        System.out.println("Digite um valor monetário: ");
        float firstCurrency = header.nextFloat();
        
        String secondText = JOptionPane.showInputDialog("Digite um texto: ");
        int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        float secondCurrency = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor monetário: "));
    }
}
