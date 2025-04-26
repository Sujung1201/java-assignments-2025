import java.math.BigInteger;
import java.util.Scanner;

public class Permutations {
    public static BigInteger permutations(BigInteger n, BigInteger k) {
        return Factorial.factorial(n).divide(Factorial.factorial(n.subtract(k)));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        BigInteger n = scanner.nextBigInteger();
        System.out.print("Enter k: ");
        BigInteger k = scanner.nextBigInteger();
        System.out.println();
        System.out.println("P(" + n + ", " + k + ") = " + permutations(n, k));
    }
}
