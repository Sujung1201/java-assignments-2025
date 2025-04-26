import java.math.BigInteger;
import java.util.Scanner;

public class ValidEmailFormat {
    public static boolean isValidEmail(String email) {
        return email.matches("[\\w+_.]+@[a-zA-Z\\d]+\\.[a-zA-Z]+$");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = scanner.next();
        System.out.println();
        System.out.println(email + (isValidEmail(email) ? " is valid" : " is invalid"));
    }
}
