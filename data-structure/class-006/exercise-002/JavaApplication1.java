package javaapplication1;

import java.util.Arrays;

public class JavaApplication1 {
    public static void main(String[] args) {
        int numbers[] = {2, 5, 1, 7, 5, 8};
        
        for (int i = numbers.length - 1; i > 0; i--) {
            int actualNumber = numbers[i];
            int j = i;
            
            while (j > 0 && numbers[j] < numbers[j - 1]) {
                numbers[j] = numbers[j - 1];
                j--;
            }
            
            numbers[j] = actualNumber;
        }
        
        System.out.println(Arrays.toString(numbers));
    }
}
