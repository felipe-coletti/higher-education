package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) {
        Scanner header = new Scanner(System.in);
		
	int monthDaysQuantity[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30 ,31};
	    
	System.out.println("Digite o número de um mês: ");
	int monthNumber = header.nextInt();
	System.out.println("Digite um ano: ");
	int year = header.nextInt();
	    
	if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
	    monthDaysQuantity[1] += 1;
	}
	    
	if (monthNumber >= 1 && monthNumber <= 12) {
	    if (monthNumber == 2) {
	    	System.out.println("O mês " + monthNumber + " de " + year + " tem " + monthDaysQuantity[monthNumber - 1] + " dias.");
	    } else {
	    	System.out.println("O mês " + monthNumber + " tem " + monthDaysQuantity[monthNumber - 1] + " dias.");
	    }
	}
    }
}
