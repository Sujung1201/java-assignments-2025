import java.math.BigDecimal;
import java.util.Scanner;

public class Bige {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of iterations: ");
        int iterations = input.nextInt();
        System.out.print("Enter number of decimal places: ");
        int decimalPlaces = input.nextInt();
        System.out.println();

        BigDecimal e = BigDecimal.ONE;
        BigDecimal term = BigDecimal.ONE;
        for (int i = 1; i <= iterations; i++) {
            term = term.divide(BigDecimal.valueOf(i), decimalPlaces, BigDecimal.ROUND_UP);
            e = e.add(term);
        }
        System.out.println("Estimate: " + e);
    }
}
