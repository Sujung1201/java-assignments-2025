import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CleanFiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file to clean: ");
        String inputFile = scanner.nextLine();

        System.out.print("Enter file to save to: ");
        String outputFile = scanner.nextLine();

        String[] badWords = {"help", "dime", "ask", "beach", "ship", "fish"};

        try {
            Scanner reader = new Scanner(new File(inputFile));
            PrintWriter writer = new PrintWriter(outputFile);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                for (String word : badWords) {
                    String stars = "";
                    for (int i = 0; i < word.length(); i++) {
                        stars += "*";
                    }

                    line = line.replaceAll("(?i)" + word, stars);
                }

                writer.println(line);
            }

            reader.close();
            writer.close();

            System.out.println("\nDone cleaning!");
        } catch (FileNotFoundException e) {
            System.out.println("\nFile not found.");
        }
    }
}
