package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Product product;
        
        String brand;
        float value, taxValue, tax;
        
        brand = JOptionPane.showInputDialog("Digite a marca do produto: ");
        value = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do produto: "));
        
        product = new Product(brand, value);
        
        product.printData();
        tax = Float.parseFloat(JOptionPane.showInputDialog("Digite a taxa de imposto em porcentagem: "));
        taxValue = product.calculateTax(tax);
        JOptionPane.showMessageDialog(null, "O imposto do produto é de R$ " + taxValue + ".");
    }
}
