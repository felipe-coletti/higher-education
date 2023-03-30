package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Invoice invoice; 
        
        double consumption = Double.parseDouble(JOptionPane.showInputDialog("Digite o consumo de energia elétrica em kilowatts hora: "));
        
        invoice = new Invoice(consumption); 
        
        invoice.printData();
    }
}
