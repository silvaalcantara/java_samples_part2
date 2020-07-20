package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        
        // File created on my C: drive inside temp folder, since i'm using WSL (Windows Subsystem for Linux) 
        // the path is relative to the Linux file system.  
        File file = new File("/mnt/c/temp/in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}