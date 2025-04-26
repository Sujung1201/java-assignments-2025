import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class NumberMaker {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = input.nextInt();
        System.out.print("Enter stop: ");
        int stop = input.nextInt();
        System.out.print("Enter step: ");
        int step = input.nextInt();
        input.nextLine();
        System.out.print("Enter file: ");
        String fileName = input.nextLine();

        File file = new File(fileName);
        PrintWriter writer = new PrintWriter(file);

        int count = 0;
        for (int i = start; i <= stop; i += step) {
            writer.print(i + " ");
            count++;
            if (count % 10 == 0) {
                writer.println();
            }
        }
        writer.close();

        System.out.print("\nWriting Complete!");
    }

}
