package javaapplication1;

import javax.swing.JOptionPane;

public class Product {
    String brand;
    float value;
    
    public Product(String brand, float value) {
        this.brand = brand;
        this.value = value;
    }
    
    void printData() {
        JOptionPane.showMessageDialog(null, "Dados do produto:\nMarca: " + brand + "\nValor: " + value);
    }
    
    float calculateTax(float tax) {
        return tax / 100 * value;
    }
}
