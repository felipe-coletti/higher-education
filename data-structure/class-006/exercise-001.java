package javaapplication1;

import java.util.Arrays;

public class JavaApplication1 {
    public static void main(String[] args) {
        int vector[] = {2, 5, 1, 7, 5, 8};
        
        for (int i = 0; i < vector.length; i++) {
            int smallerNumber = vector[i];
            int k = i;
            
            for (int j = i; j < vector.length; j++) {
                if (vector[j] < smallerNumber) {
                    smallerNumber = vector[j];
                    k = j;
                }
            }
            
            vector[k] = vector[i];
            vector[i] = smallerNumber;
        }
        
        System.out.println(Arrays.toString(vector));
    }
}
