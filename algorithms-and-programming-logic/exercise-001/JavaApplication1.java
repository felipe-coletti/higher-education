package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        // Entrada
        
        System.out.println("Digite o código da peça: ");
        int pieceCode = header.nextInt();
        System.out.println("Digite o valor da peça: ");
        float pieceValue = header.nextFloat();
        System.out.println("Digite a quantidade de peças: ");
        int pieceQuantity = header.nextInt();
        
        // Processamento
        
        float totalValue = pieceValue * pieceQuantity;
        
        // Saída
        
        System.out.println("O valor total das peças com o código " + pieceCode + " é: R$ " + totalValue + ".");
    }
}