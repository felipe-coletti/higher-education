package javaapplication1;

import java.util.Arrays;

public class JavaApplication1 {
    public static void main(String[] args) {
        int vector[] = {2, 5, 1, 7, 5, 8};
        
        for (int i = 0; i < vector.length; i++) {
            int actualNumber = vector[i];
            int predecessorIndex = i - 1;
            
            while (predecessorIndex >= 0 && vector[predecessorIndex] > actualNumber) {
                vector[predecessorIndex + 1] = vector[predecessorIndex];
                predecessorIndex--;
            }
            
            vector[predecessorIndex + 1] = actualNumber;
        }
        
        System.out.println(Arrays.toString(vector));
    }
}
