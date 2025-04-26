import java.math.BigInteger;
import java.util.Scanner;

public class Combinations {
    public static BigInteger combinations(BigInteger n, BigInteger k) {
        return Permutations.permutations(n, k).divide(Factorial.factorial(k));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        BigInteger n = scanner.nextBigInteger();
        System.out.print("Enter k: ");
        BigInteger k = scanner.nextBigInteger();
        System.out.println();
        System.out.println("C(" + n + ", " + k + ") = " + combinations(n, k));
    }
}
