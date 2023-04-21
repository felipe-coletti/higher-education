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
        
        System.out.println("O primeiro texto é: " + firstText);
        System.out.println("O primeiro número é: " + firstNumber);
        System.out.println("O primeiro valor monetário é: " + firstCurrency);
        
        JOptionPane.showMessageDialog("O segundo texto é: " + secondText);
        JOptionPane.showMessageDialog("O segundo número é: " + secondNumber);
        JOptionPane.showMessageDialog("O segundo valor monetário é: " + secondCurrency);
    }
}
