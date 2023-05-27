package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
        
        System.out.println("Digite a distância percorrida durante a viagem em quilometros: ");
        float distance = header.nextFloat();
        System.out.println("Digite a quantidade de combustível gasta durante a viagem: ");
        float fuel = header.nextFloat();
        
        float fuelConsumption = distance / fuel;
        
        System.out.println("O consumo médio do veículo foi de  " + fuelConsumption + " Km/L.");
    }
}
