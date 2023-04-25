package javaapplication1;

import javax.swing.JOptionPane;

public class JavaApplication1 {
    public static void main(String[] args) {
        float temperatures[] = new Float[7];
        float average = 0, warmerDays = 0, colderays = 0;
        
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = Float.parseFloat(JOptionPane.showInputDialog("Digite a temperatura do " + (i + 1) + "º dia."));
            
            average += temperatures[i];
        }
        
        average /= 7;
        
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > average) {
                warmerDays++;
            }
            if (temperatures[i] < average) {
                colderays++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "A média de temperatura da semana foi de " + average + "°C.");
        JOptionPane.showMessageDialog(null, warmerDays + "dias ficaram acima da média de temperatura.");
        JOptionPane.showMessageDialog(null, colderays + "dias ficaram abaixo da média de temperatura.");
    }
}
