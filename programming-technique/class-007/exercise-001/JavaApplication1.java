package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        final int length = 30;
        int numbers[] = new int[length];
        
        for (int i = 0; i < length; i++) {
            numbers[i] = i + 10;
            
            if (numbers[i] % 2 == 0) {
                switch(numbers[i]) {
                    case 10:
                        System.out.println("Dez");
                        break;
                    case 20:
                        System.out.println("Vinte");
                        break;
                    case 30:
                        System.out.println("Trinta");
                        break;
                    default:
                        System.out.println(numbers[i]);
                        break;
                }
            }
        }
    }
}
