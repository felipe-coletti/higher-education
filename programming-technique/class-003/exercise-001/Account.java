package javaapplication1;

import javax.swing.JOptionPane;

public class Account {
    String branch, number;
    float balance, yieldRate;
    
    public Account(String branch, String number, float balance, float fee) {
        this.branch = branch;
        this.number = number;
        this.balance = balance;
        this.yieldRate = yieldRate;
    }
    
    void printData() {
        JOptionPane.showMessageDialog(null, "Dados da conta corrente:\nAgência: " + branch + "\nNúmero: " + number + "\nSaldo: " + balance + "\nTaxa: " + yieldRate);
    }
    
    void depositMoney(float value) {
        balance += value;
    }
    
    float calculateIncome() {
        return yieldRate / 100 * balance;
    }
}
