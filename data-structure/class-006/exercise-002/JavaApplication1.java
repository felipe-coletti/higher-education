package javaapplication1;

import java.util.Arrays;

public class JavaApplication1 {
    public static void main(String[] args) {
        int vector[] = {2, 5, 1, 7, 5, 8};
        
        for (int i = vector.length - 1; i > 0; i--) {
            int actualNumber = vector[i];
            int j = i;
            
            while (j > 0 && vector[j] < vector[j - 1]) {
                vector[j] = vector[j - 1];
                j--;
            }
            
            vector[j] = actualNumber;
        }
        
        System.out.println(Arrays.toString(vector));
    }
}
