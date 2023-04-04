package javaapplication1;

import javax.swing.JOptionPane;

public class Client extends Person{
    private float debtAmount;

    public Client(String name, String telephone, float debtAmount) {
        super(name, telephone);
        this.debtAmount = debtAmount;
    }

    public float getDebtAmount() {
        return debtAmount;
    }

    public void setDebtAmount(float debtAmount) {
        this.debtAmount = debtAmount;
    }
    
    public void printData() {
        super.printData();
        JOptionPane.showMessageDialog(null, "Valor da dívida: " + debtAmount);
    }
    
    public float calculateDebtInterest(float interestRate) {
        return interestRate / 100 * debtAmount;
    }
}
