package javaapplication1;

import java.util.Arrays;

public class JavaApplication1 {
    public static void main(String[] args) {
        int numbers[] = {2, 5, 1, 7, 5, 8};
        
        for (int i = 0; i < vector.length; i++) {
            int smallerNumber = numbers[i];
            int smallerNumberIndex = i;
            
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] < smallerNumber) {
                    smallerNumber = numbers[j];
                    smallerNumberIndex = j;
                }
            }
            
            numbers[smallerNumberIndex] = numbers[i];
            numbers[i] = smallerNumber;
        }
        
        System.out.println(Arrays.toString(numbers));
    }
}
