package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("João", "(99) 99999-9999", 125.40f);
        
        client.setName("Maria");
        
        client.printData();
        
        JOptionPane.showMessageDialog(null, "Juros da dívida: " + client.calculateDebtInterest(1.5f));
        
        Supplier supplier = new Supplier("João", "(99) 99999-9999", 1500.89f);
        
        supplier.printData();
        
        JOptionPane.showMessageDialog(null, "Imposto da compra: " + supplier.calculatePurchaseTax(12.5f));
    }
}
