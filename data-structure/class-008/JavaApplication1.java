package javaapplication1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class JavaApplication1 {
    public static void main(String[] args) throws IOException {
        readFile();
        writeFile();
    }

    private static void readFile() throws FileNotFoundException, IOException {
        final String path = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\primeiroArquivo.txt";
        
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        String line = bufferedReader.readLine();
        
        while (line != null) {
            System.out.println(line);
            
            line = bufferedReader.readLine();
        }
    }

    private static void writeFile() throws FileNotFoundException, IOException {
        final String newFile = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\segundoArquivo.txt";
        
        FileWriter fileWriter = new FileWriter(newFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        String line = "Primeira linha.";
        
        bufferedWriter.write(line);
        
        bufferedWriter.newLine();
        
        line = "Segunda linha.";
        
        bufferedWriter.write(line);
        
        bufferedWriter.flush();
    }
}
