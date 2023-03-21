package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication1 {
    public static void main(String[] args) {
        String text_1,  text_2;
        int value_1, value_2;
        float currency_1, currency_2;
        
        Scanner header = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        text_1 = header.next();
        System.out.println("Digite um número inteiro: ");
        value_1 = header.nextInt();
        System.out.println("Digite um valor monetário: ");
        currency_1 = header.nextFloat();
        
        text_2 = JOptionPane.showInputDialog("Digite um texto: ");
        value_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        currency_2 = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor monetário: "));
    }
}
