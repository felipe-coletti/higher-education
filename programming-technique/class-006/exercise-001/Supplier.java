package javaapplication1;

import javax.swing.JOptionPane;

public class Supplier extends Person {
    private float purchasePrice;
    
    public Supplier(String name, String telephone, float purchasePrice) {
        super(name, telephone);
        this.purchasePrice = purchasePrice;
    }
    
    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }
    
    public void printData() {
        super.printData();
        JOptionPane.showMessageDialog(null, "Valor da compra: " + purchasePrice);
    }
    
    public float calculatePurchaseTax(float taxRate) {
        purchasePrice += taxRate / 100 * purchasePrice;
    }
}
