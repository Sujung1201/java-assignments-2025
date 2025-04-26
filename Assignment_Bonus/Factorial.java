import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        while (n.compareTo(BigInteger.ZERO) > 0) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        BigInteger n = scanner.nextBigInteger();
        System.out.println();
        System.out.println(n + "! = " + factorial(n));
    }

}
