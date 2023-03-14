package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Account account;
        
        String branch, number;
        float balance, fee, depositValue, income;
        
        branch = JOptionPane.showInputDialog("Digite o número da agência: ");
        number = JOptionPane.showInputDialog("Digite o número da conta: ");
        balance = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo da conta: "));
        fee = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da taxa: "));
        
        account = new Account(branch, number, balance, fee);
        
        account.printData();
        income = account.calculateIncome();
        JOptionPane.showMessageDialog(null, "O rendimento da conta é de R$ " + income + ".");
        depositValue = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado: "));
        account.depositMoney(depositValue);
        account.printData();
    }
}
