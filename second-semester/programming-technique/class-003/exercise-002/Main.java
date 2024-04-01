package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Product product;
        
        String brand = JOptionPane.showInputDialog("Digite a marca do produto: ");
        float value = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
        
        product = new Product(brand, value);
        
        product.printData();
        
        float taxRate = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de imposto: "));
        
        float taxValue = product.calculateTaxValue(tax);
        
        JOptionPane.showMessageDialog(null, "O valor de imposto do produto é de R$ " + taxValue + ".");
    }
}
