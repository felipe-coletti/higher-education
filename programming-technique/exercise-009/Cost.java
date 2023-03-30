package javaapplication1;

import javax.swing.JOptionPane;

public class Cost {
    double consumption, fare, suply, icms, cofins, pis, icmsCofins, icmsPis;

    public Cost(double consumption) {
        this.consumption = consumption;
        this.fare =  0.28172;
        this.suply = consumption * fare;
        this.icms = icms;
        this.cofins = cofins;
        this.pis = pis;
        this.icmsCofins = icmsCofins;
        this.icmsPis = icmsPis;
    }

    void printBill() {
        if (consumption <= 200) {
            this.icms = suply * 0.136363;
            this.cofins = suply * 0.0614722;
            this.pis = suply * 0.013346;
            this.icmsCofins = suply * 0.136363 * 0.0614722;
            this.icmsPis = suply * 0.136363 * 0.013346;
        } else {
            this.icms = suply * 0.333333;
            this.cofins = suply * 0.0730751;
            this.pis = suply * 0.0158651;
            this.icmsCofins = suply * 0.333333 * 0.0730751;
            this.icmsPis = suply * 0.333333 * 0.0158651;
        }
        
        JOptionPane.showMessageDialog(null, "Dados da fatura:\nFornecimento: " + suply + "\nICMS: " + icms + "\nCOFINS: " + cofins + "\nPIS/PASESP: " + pis + "\nICMS sobre COFINS: " + icmsCofins + "\nICMS sobre PIS/PASESP: " + icmsPis);
    }
}
