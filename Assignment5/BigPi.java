import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class BigPi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of iterations: ");
        int iterations = input.nextInt();
        System.out.print("Enter number of decimal places: ");
        int decimalPlaces = input.nextInt();
        System.out.println();

        BigDecimal pi = BigDecimal.ZERO;
        for (int i = 1; i <= iterations; i++) {
            pi = pi.add(BigDecimal.valueOf(-1).pow(i+1).divide(BigDecimal.valueOf(2*i-1), decimalPlaces, BigDecimal.ROUND_UP));
        }
        pi = pi.multiply(BigDecimal.valueOf(4));
        System.out.println("Estimate: " + pi);
    }
}