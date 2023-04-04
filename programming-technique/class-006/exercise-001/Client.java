package javaapplication1;

import javax.swing.JOptionPane;

public class Client extends Person{
    private float debtAmount;

    public Client(float debtAmount, String name, String telephone) {
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
    
    public float calculateInterest(float interestRate) {
        return interestRate / 100 * debtAmount;
    }
}
