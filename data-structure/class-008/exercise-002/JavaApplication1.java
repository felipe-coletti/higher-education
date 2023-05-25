package javaapplication1;

public class JavaApplication1 {
    public static void main(String[] args) {
        substringDateFormatting("2020-09-27");
        splitDateFormatting("2020-09-27");
    }
    
    private static void substringDateFormatting(String date) {
        String year = date.substring(0, 4);
        String month = date.substring(5, 7);
        String day = date.substring(8, 10);
        String newDate = day + "/" + month + "/" + year;
        System.out.println(newDate);
    }
    
    private static void splitDateFormatting(String date) {
        String year = date.split("-")[0];
        String month = date.split("-")[1];
        String day = date.split("-")[2];
        String newDate = day + "/" + month + "/" + year;
        System.out.println(newDate);
    }
}
