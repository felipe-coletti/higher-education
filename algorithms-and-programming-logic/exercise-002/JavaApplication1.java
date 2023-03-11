package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite a quantidade mínima de peçass: ");
        int minimumQuantity = header.nextInt();
        System.out.println("Digite a quantidade máxima de peças: ");
        int maximumQauntity = header.nextInt();
        
        int averageStock = minimumQuantity * maximumQauntity / 2;
        
        System.out.println("A quantidade média de peças no estoque é: " + averageStock + ".");
    }
}
