package hendev.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String filePath = "E:\\Apps\\Java\\Java-Series--ED-\\FileReadWrite\\src\\hendev\\files\\FileFolder\\";
        String fileName = "students";
        String fileFormat = ".txt";
        String combinedFile = CombineFileAndPath(filePath, fileName, fileFormat);

        WriteToFile(combinedFile);
        ReadFileContent(combinedFile);
        CreateFile(combinedFile);
        GetFileSpecifics(combinedFile);
    }

    private static String CombineFileAndPath(String filePath, String fileName, String fileFormat) {
        return filePath + fileName + fileFormat;
    }

    private static void WriteToFile(String fileInfo) {
        try {
            FileWriter file = new FileWriter(fileInfo, true);
            BufferedWriter writer = new BufferedWriter(file);
            writer.newLine();
            writer.write("Engin Demirog Java & React organised by kodlama.io"); //Overwrites everything !! true after path makes file appends !
            System.out.println("File Input Completed");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void ReadFileContent(String fileInfo) {
        File file = new File(fileInfo);
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void GetFileSpecifics(String fileInfo) {
        File file = new File(fileInfo);
        if (file.exists()) {
            System.out.println("File Name \t: " + file.getName());
            System.out.println("File Path \t: " + file.getAbsolutePath());
            System.out.println("File Write \t: " + file.canWrite());
            System.out.println("File Read \t: " + file.canRead());
            System.out.println("File Size \t: " + file.length());
        }
    }

    private static void CreateFile(String fileInfo) {
        File file = new File(fileInfo);

        try {
            if (file.createNewFile()) {
                System.out.println("File Created");
            } else {
                System.out.println("File Already Exists");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
