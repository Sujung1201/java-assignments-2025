import java.util.Scanner;

public class WCCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter text: ");
        String s = input.nextLine();

        int wordCount = s.length() - s.replace(" ", "").length();
        int characterCount = s.replace(" ", "").length();
        System.out.println("\nWord count: " + (wordCount + 1));
        System.out.println("Character count: " + characterCount);
    }
}
