package javaapplication1;

import javax.swing.JOptionPane;

public class Cost {
    double consumption, fare, aliquot, multiplicationFactor, suply;
  
    public Cost(double consumption) {
        this.consumption = consumption;
        this.fare =  0.28172;
        this.aliquot = aliquot;
        this.multiplicationFactor = multiplicationFactor;
        this.suply = consumption * fare;
    }
  
    double icms() {
        if (consumption <= 200) {
            aliquot = 0.12;
            multiplicationFactor = 0.136363;
        } else {
            aliquot = 0.25;
            multiplicationFactor = 0.333333;
        }
          
        return multiplicationFactor * suply * aliquot;
    }
      
    double cofins() {
        aliquot = 0.05033;
          
        if (consumption <= 200) {
            multiplicationFactor = 0.0614722;
        } else {
            multiplicationFactor = 0.0730751;
        }
          
        return multiplicationFactor * suply * aliquot;
    }
      
    double pis() {
        aliquot = 0.010927;
          
        if (consumption <= 200) {
            multiplicationFactor = 0.013346;
        } else {
            multiplicationFactor = 0.0158651;
        }
          
        return multiplicationFactor * suply * aliquot;
    }
  
    double icmsCofins = cofins() * icms() * suply;
  
    double icmsPis = pis() * icms() * suply;
  
    void printBill() {
        JOptionPane.showMessageDialog(null, "Dados da fatura:\nFornecimento: " + suply + "\nICMS: " + icms() + "\nCOFINS: " + cofins() + "\nPIS/PASESP: " + pis() + "\nICMS sobre COFINS: " + icmsCofins + "\nICMS sobre PIS/PASESP: " + icmsPis);
    }
}
