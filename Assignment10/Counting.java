import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            Scanner fileScanner = new Scanner(new File(fileName));

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineCount++;

                for (int i = 0; i < line.length(); i++) {
                    char ch = line.charAt(i);
                    if (ch != ' ' && ch != '\t') {
                        charCount++;
                    }
                }

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            fileScanner.close();

            System.out.println("Characters: " + charCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Lines: " + lineCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
