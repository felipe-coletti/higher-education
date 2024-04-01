package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite o tempo gasto na viagem: ");
        float t = header.nextFloat();
        System.out.println("Digite a velocidade média do veículo durante a viagem: ");
        float v = header.nextFloat();
        
        float d = t * v;
        
        float l = d / 12;
        
        System.out.println("A distância percorrida pelo veículo foi de " + d + " Km e a quantidade de combustível gasta na viagem foi de " + l + " L.");
    }
}
