package javaapplication1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        
        int option;
        String task;
        
        do {
            option = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 para enfileirar;\n2 para início;\n3 para desenfileirar;\nOu 0 para voltar."));
            
            switch (option) {
                case 1:
                    task = JOptionPane.showInputDialog("Digite uma tarefa: ");
                    queue.toQueue(task);
                    break;
                case 2:
                    task = (String) queue.start();
                    JOptionPane.showMessageDialog(null, task);
                    break;
                case 3:
                    task = (String) queue.unqueue();
                    JOptionPane.showMessageDialog(null, task);
                    break;
                case 4:
                    task = (String) queue.print();
                    JOptionPane.showMessageDialog(null, task);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (option != 0);
    }
}
