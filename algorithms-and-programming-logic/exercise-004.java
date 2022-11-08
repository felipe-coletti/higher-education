package javaapplication1;
public class exercise-004 {
    public static void main(String[] args) {
        float a[] = {3, 5, 6, 8, 10};
        float s = 0;
        
        for(int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                s += a[i];
            }
            
            System.out.print("A soma dos valores é: " + s + ".");
        }
    } 
}
