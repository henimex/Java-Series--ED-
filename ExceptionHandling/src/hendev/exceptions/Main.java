package hendev.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //FirstExceptionHandling();
        //ReadFile();

        ThrowDemo();
    }

    private static void ThrowDemo() {
        AccountManager manager = new AccountManager();

        System.out.println("----------- Account Information -----------");
        System.out.println("Account Balance \t: " + manager.getBalance());

        manager.deposit(100);
        try {
            manager.withdraw(10);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        try {
            manager.withdraw(100);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    private static void ReadFile() {
        BufferedReader reader = null;
        int total = 0;
        int lineSize = 0;

        try {
            reader = new BufferedReader(new FileReader("D:\\pdkslog.txt"));
            String line = "test";
            while ((line = reader.readLine()) != null) {
                //total+=Integer.valueOf(line);
                if (line.contains("Afiyet Olsun")) {
                    System.out.println(line.replace("\t", " "));
                    lineSize += 1;
                }
            }
            System.out.println("Total Lines of File : " + lineSize);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void FirstExceptionHandling() {
        int exceptionCounter = 0;
        try {
            int[] numbers = new int[]{1, 2, 3, 4, 5, 6};
            System.out.println(numbers[15]);

            String city = "Ankara";
            System.out.println(city.charAt(19));

        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("1 There is an Error");
            System.out.println(exception.getMessage());
            exceptionCounter += 1;
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("2 There is an Error");
            System.out.println(exception.getMessage());
            exceptionCounter += 1;
        } finally {
            System.out.println("Request Completed With " + exceptionCounter + " error/s");
        }
    }
}
