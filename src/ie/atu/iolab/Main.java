package ie.atu.iolab;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

import java.nio.file.Files;

public class Main {
    public static void main(String[] args) {
        // String inputPath = "resources/input.txt";
        // String outputPath = "resources/output.txt";

        // FileInputStream fis = null;
        // FileOutputStream fos = null;
        // try{ 
        //     fis = new FileInputStream(inputPath);
        //     fos = new FileOutputStream(outputPath);
        //     int data;
        //     int charCount = 0;
        //     int byteCount = 0;

        //     while ((data = fis.read()) != -1) {
        //         System.out.print((char) data);
        //         charCount++;
        //         byteCount++;
        //     }
        //     System.out.println("\nNumber of characters: " + charCount);
        //     System.out.println("Number of bytes: " + byteCount);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }


        //Example 4
        Path projectRoot = Paths.get(System.getProperty("user.dir"));
        Path inputFilePath = projectRoot.resolve("resources").resolve("input.txt");

        if (Files.exists(inputFilePath)) {
            System.out.println("input.txt found at: " + inputFilePath.toAbsolutePath());
        } else {
            System.out.println("input.txt not found at: " + inputFilePath.toAbsolutePath());
        }

        
        // String inputPath = projectRoot.resolve("resources").resolve("input.txt").toString();
        // String outputPath = "resources/output.txt";

        // try (FileInputStream fis = new FileInputStream(inputPath);
        //      FileOutputStream fos = new FileOutputStream(outputPath)) {

        //     int data;
        //     while ((data = fis.read()) != -1) {
        //         char ch = (char) data;
        //         char lower = Character.toLowerCase(ch);
        //         fos.write(Character.toUpperCase((char)data));
        //         if ("this".indexOf(lower) != -1) {
        //             fos.write(Character.toUpperCase(ch));
        //         }else{
        //             fos.write(Character.toLowerCase(ch));
        //         }
        //     }


        //     System.out.println("File processed successfully.");

        // } catch (IOException e) {
        //     System.err.println("Error processing file: " + e.getMessage());
        // } 

        //Example 5
        String inputPath = projectRoot.resolve("resources").resolve("input.txt").toString();
        String outputPath = projectRoot.resolve("resources").resolve("output.txt").toString();

        try (FileReader reader = new FileReader(inputPath);) {
                StringBuilder content = new StringBuilder();

            int character;
            while ((character = reader.readLine()) != -1) {
                content.append((char) character);
            }

            try(FileWriter writer = new FileWriter(outputPath)) {
                writer.write(content.toString());
            System.out.println("File content reversed successfully.");

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
    }
}
    }  
}
    

