package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cost cost = new Cost(consumption); 
        
        String consumption = JOptionPane.showInputDialog("Digite o consumo de energia elétrica em kilowatts hora: ");
        
        printBill();
    }
}
