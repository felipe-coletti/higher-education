package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite por quantos dias o cliente ficou hospedado no hotel: ");
        float days = header.nextFloat();
        
        float dailyRates = days * 95;
        
        float serviceFee;
        
        if (days > 10) {
            serviceFee = dailyRates / 100 * 15;
        } else if (days == 10) {
            serviceFee = dailyRates / 100 * 10;
        } else {
            serviceFee = dailyRates / 100 * 5;
        }
        
        float totalPrice = dailyRates + serviceFee;
        
        System.out.println("O preço das diárias é de R$ " + dailyRates + ".");
        System.out.println("A taxa de serviço é de R$ " + serviceFee + ".");
        System.out.println("O preço total a pagar é de R$ " + totalPrice + ".");
    }
}
