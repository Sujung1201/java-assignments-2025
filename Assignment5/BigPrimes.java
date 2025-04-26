import java.math.BigInteger;
import java.util.Scanner;

public class BigPrimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter start of range: ");
        BigInteger start = new BigInteger(input.nextLine());
        System.out.print("Enter end of range: ");
        BigInteger end = new BigInteger(input.nextLine());
        System.out.println("\nPrimes: ");

        for (BigInteger i = start; i.compareTo(end) < 0; i = i.add(BigInteger.ONE)) {
            if (i.isProbablePrime(10)) {
                System.out.println(i);
            }
        }
    }
}
