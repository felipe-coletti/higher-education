package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Account account;
        
        String branch = JOptionPane.showInputDialog("Digite o número da agência: ");
        String number = JOptionPane.showInputDialog("Digite o número da conta: ");
        float balance = Float.parseFloat(JOptionPane.showInputDialog("Digite o saldo da conta: "));
        float rate = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da taxa: "));
        
        account = new Account(branch, number, balance, rate);
        
        account.printData();
        
        float income = account.calculateIncome();
        
        JOptionPane.showMessageDialog(null, "O rendimento da conta é de R$ " + income + ".");
        
        float depositValue = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor a ser depositado: "));
        
        account.depositMoney(depositValue);
        account.printData();
    }
}
