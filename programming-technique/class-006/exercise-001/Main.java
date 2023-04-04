package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Debt debt = new Debt("João", "(00) 91234-5678", 125.40f);
        
        debt.setName("");
        
        debt.printData();
        
        JOptionPane.showMessageDialog(null, "Juros da dívida: " + debt.calculateInterest(1.5f));
        
        Purchase purchase = new Purchase("João", "(00) 91234-5678", 1500.89f);
        
        purchase.printData();
        
        JOptionPane.showMessageDialog(null, "Imposto da compra: " + purchase.calculateTax(12.5f));
    }
}
