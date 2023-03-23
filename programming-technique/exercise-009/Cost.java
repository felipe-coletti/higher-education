package javaapplication1;

public class Cost {
    float fare, aliquot, multiplicationFactor, suply;
  
    public Cost(consumption) {
        this.fare =  0.28172;
        this.aliquot = aliquot;
        this.multiplicationFactor = multiplicationFactor;
        this.suply = consumption * fare;
    }
  
    float icms(consumption) {
        if (consumption <= 200) {
            aliquot = 0.12;
            multiplicationFactor = 0.136363;
        } else {
            aliquot = 0.25;
            multiplicationFactor = 0.333333;
        }
          
        return multiplicationFactor * suply;
    }
      
    float cofins(consumption) {
        aliquot = 0.05033;
          
        if (consumption <= 200) {
            multiplicationFactor = 0.0614722;
        } else {
            multiplicationFactor = 0.0730751;
        }
          
        return multiplicationFactor * suply;
    }
      
    float pis(consumption) {
        aliquot = 0.010927;
          
        if (consumption <= 200) {
            multiplicationFactor = 0.013346;
        } else {
            multiplicationFactor = 0.0158651;
        }
          
        return multiplicationFactor * suply;
    }
  
    float icmsCofins = cofins() * icms() * suply;
  
    float icmsPis = pis() * icms() * suply;
  
    void printBill(consumption) {
        JOptionPane.showMessageDialog(null, "Dados da fatura:\nFornecimento: " + suply + "\nICMS: " + icms(consumption) + "\nCOFINS: " + cofins(consumption) + "\nPIS/PASESP: " + pis(consumption) + "\nICMS sobre COFINS: " + icmsCofins + "\nICMS sobre PIS/PASESP: " + icmsPis);
    }
}
