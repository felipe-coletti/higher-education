package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Cost cost; 
        
        double consumption = Double.parseDouble(JOptionPane.showInputDialog("Digite o consumo de energia elétrica em kilowatts hora: "));
        
        cost = new Cost(consumption); 
        
        printBill();
    }
}
