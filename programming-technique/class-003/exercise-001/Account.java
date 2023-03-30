package javaapplication1;

import javax.swing.JOptionPane;

public class Account {
    String branch, number;
    float balance, fee;
    
    public Account(String branch, String number, float balance, float fee) {
        this.branch = branch;
        this.number = number;
        this.balance = balance;
        this.fee = fee;
    }
    
    void printData() {
        JOptionPane.showMessageDialog(null, "Dados da conta corrente:\nAgência: " + branch + "\nNúmero: " + number + "\nSaldo: " + balance + "\nTaxa: " + fee);
    }
    
    void depositMoney(float value) {
        balance += value;
    }
    
    float calculateIncome() {
        return fee / 100 * balance;
    }
}
