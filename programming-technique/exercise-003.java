package javaapplication1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class JavaApplication1 {
    public static void main(String[] args) {
        String texto_1,  texto_2;
        int valor_1, valor_2;
        float moeda_1, moeda_2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um texto: ");
        texto_1 = entrada.next();
        System.out.println("Digite um número inteiro: ");
        valor_1 = entrada.nextInt();
        System.out.println("Digite um vlor monetário: ");
        moeda_1 = entrada.nextFloat();
        
        texto_2 = JOptionPane.showInputDialog("Digite um texto: ");
        valor_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        moeda_2 = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor monetário: "));
    }
}
