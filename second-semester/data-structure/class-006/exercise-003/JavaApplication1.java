package javaapplication1;

import java.util.Arrays;

public class JavaApplication1 {
    public static void main(String[] args) {
        int numbers[] = {2, 5, 1, 7, 5, 8};
        
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length - 1; j++) {
                if (numbers[j] < numbers[j - 1]) {
                    int actualNumber = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = actualNumber;  
                }
            }
        }
        
        System.out.println(Arrays.toString(numbers));
    }
}
