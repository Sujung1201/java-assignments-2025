import java.math.BigInteger;
import java.util.Scanner;

public class SantitizeInput {
    public static String sanitize(String text) {
        return text.replaceAll("<[^>]+>", "");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        System.out.println();
        System.out.println("Sanitized: " + sanitize(text));
    }
}
