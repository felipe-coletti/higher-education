package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite o horário de entrada: ");
        int checkInTime = header.nextInt();
        System.out.println("Digite o horário de saída: ");
        int departureTime = header.nextInt();
        
        int stayLength = departureTime - checkInTime;
        
        if (checkInTime >= 8 && departureTime <= 18) {
            if (stayLength <= 1) {
                System.out.println("O valor a ser pago é de R$ 8,00.");
            } else if (stayLength == 2) {
                System.out.println("O valor a ser pago é de R$ 15,00.");
            } else {
                System.out.println("O valor a ser pago é de R$ " + stayLength * 5 + ".");
            }
        } else {
            System.out.println("O horário de entrada e/ou de saída está fora do horário de funcionamento do estacionamento.");
        }
    }
}
