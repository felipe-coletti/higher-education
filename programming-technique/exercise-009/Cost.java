package javaapplication1;

public class Cost {
    float fare, aliquot, multiplicationFactor, suply;
  
    public Cost() {
        this.fare =  0.28172;
        this.aliquot = aliquot;
        this.multiplicationFactor = multiplicationFactor;
        this.suply = consumption * fare;
    }
  
    float ICMS(consumption) {
        if (consumption <= 200) {
            aliquot = 0.12;
            multiplicationFactor = 0.136363;
        } else {
            aliquot = 0.25;
            multiplicationFactor = 0.333333;
        }
          
        return multiplicationFactor * suply;
    }
      
    float COFINS(consumption) {
        aliquot = 0.05033;
          
        if (consumption <= 200) {
            multiplicationFactor = 0.0614722;
        } else {
            multiplicationFactor = 0.0730751;
        }
          
        return multiplicationFactor * suply;
    }
      
    float PIS(consumption) {
        aliquot = 0.010927;
          
        if (consumption <= 200) {
            multiplicationFactor = 0.013346;
        } else {
            multiplicationFactor = 0.0158651;
        }
          
        return multiplicationFactor * suply;
    }
  
    float icmsCofins() {
        return COFINS() * ICMS() * suply;
    }
  
    float icmsPis() {
        return PIS() * ICMS() * suply;
    }
  
    String bill() {
        JOptionPane.showMessageDialog(null, "Dados da fatura:\nFornecimento: " + suply + "\nICMS: " + ICMS(consumption) + "\nCOFINS: " + COFINS(consumption) + "\nPIS/PASESP: " + PIS(consumption) + "\nICMS sobre COFINS: " + icmsCofins() + "\nICMS sobre PIS/PASESP: " + icmsPis());
    }
}
