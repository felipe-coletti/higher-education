package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("", "(00) 91234-5678", 125.40f);
        
        client.setName("");
        
        client.printData();
        
        JOptionPane.showMessageDialog(null, "Juros da dívida: " + client.calculateDebtInterest(1.5f));
        
        Supplier supplier = new Supplier("", "(00) 91234-5678", 1500.89f);
        
        supplier.printData();
        
        JOptionPane.showMessageDialog(null, "Imposto da compra: " + supplier.calculatePurchaseTax(12.5f));
    }
}
