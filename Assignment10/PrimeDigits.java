import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimeDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        int[] counts = new int[10];
        int total = 0;

        try {
            Scanner fileScanner = new Scanner(new File(fileName));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);

                    if (ch >= '0' && ch <= '9') {
                        int digit = ch - '0';
                        counts[digit]++;
                        total++;
                    }
                }
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(i + "s: " + counts[i]);
            }
            System.out.println("Total: " + total);

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}