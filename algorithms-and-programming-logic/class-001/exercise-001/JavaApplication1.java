package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite o código da peça: ");
        int code = header.nextInt();
        System.out.println("Digite o valor da peça: ");
        float value = header.nextFloat();
        System.out.println("Digite a quantidade de peças: ");
        int quantity = header.nextInt();
        
        float totalValue = value * quantity;
        
        System.out.println("O valor total das peças com o código " + code + " é: R$ " + value + ".");
    }
}
