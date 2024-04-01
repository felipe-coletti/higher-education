package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Participant participant;
        
        String name = JOptionPane.showInputDialog("Digite o nome do participante: ");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do participante: "));
        
        participant = new Participant(name, age);
        
        participant.printData();
    }
}
