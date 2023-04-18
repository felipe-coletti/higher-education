package javaapplication1;

import javax.swing.JOptionPane;

public class JavaApplication1 {
    public static void main(String[] args) {
        String[] names = new String[4];
        Float[] grades = new Float[4];
        float sum = 0;
        
        for (int i = 0; i < 4; i++) {
            names[i] = JOptionPane.showInputDialog("Digite o nome do " + (i + 1) + "º aluno.");
            grades[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota do " + (i + 1) + "º aluno."));
            
            sum += grades[i];
        }
        
        float average = sum / 4;
        
        for (int i = 0; i < 4; i++) {
            if (grades[i] > average) {
                JOptionPane.showMessageDialog(null, names[i] + " teve uma nota acima da média da sala.");
            }
        }
    }
}
