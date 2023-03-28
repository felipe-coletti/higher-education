package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cost cost; 
        
        String consumption = JOptionPane.showInputDialog("Digite o consumo de energia elétrica em kilowatts hora: ");
        
        cost = new Cost(consumption); 
        
        printBill();
    }
}
