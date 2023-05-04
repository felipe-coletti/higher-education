package javaapplication1;

import javax.swing.JOptionPane;

public class Product {
    String brand;
    float value;
    
    public Product(String brand, float value) {
        this.brand = brand;
        this.value = value;
    }
    
    public void printData() {
        JOptionPane.showMessageDialog(null, "Dados do produto:\nMarca: " + brand + "\nValor: " + value);
    }
    
    public float calculateTaxValue(float taxRate) {
        return taxRate / 100 * value;
    }
}
