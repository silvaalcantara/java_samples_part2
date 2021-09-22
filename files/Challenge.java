package files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Challenge {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for (File file : files) {
            System.out.println(file);
        }

        System.out.println("Enter a file name: ");
        String filePath = sc.nextLine();

        boolean success = new File(strPath + "\\out").mkdir();
        System.out.println("Sub directory created successfully: " + success);

        // Try with resources avaiable onyl with Java 7+
        try (BufferedReader br = new BufferedReader(new FileReader(strPath + "\\" + filePath)); BufferedWriter bw = new BufferedWriter(new FileWriter(path + "\\out\\summary.csv"))) {
            String line = br.readLine();

            float x,y;

            while (line != null) {
                System.out.println(line);
                String[] parts = line.split(",");
                x = Float.parseFloat(parts[1].replaceAll(" ", ""));
                y = Float.parseFloat(parts[2].replaceAll(" ", ""));
                float sum = x * y;
                bw.write(parts[0] + "," + sum);
                bw.newLine();

                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
