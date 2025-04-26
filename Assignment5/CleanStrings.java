import java.util.Scanner;

public class CleanStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] lst = {"help", "dime", "ask", "beach", "ship", "fish"};
        System.out.print("Enter text: ");
        String s = input.nextLine();

        for (String i : lst) {
            if (s.contains(i)) {
                s = s.replaceAll(i, "****");
            }
        }
        System.out.println("Cleaned text: " + s);
    }
}
