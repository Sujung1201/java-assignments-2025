import java.math.BigInteger;
import java.util.Scanner;

public class MersennePrimes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter max p: ");
        BigInteger p = new BigInteger(input.nextLine());
        System.out.println("\np\t\tMersenne Prime");
        for (BigInteger i = BigInteger.valueOf(2); i.compareTo(p) <= 0; i = i.add(BigInteger.ONE)) {
            if (i.isProbablePrime(10)) {
                BigInteger m = BigInteger.valueOf(2).pow(i.intValue()).subtract(BigInteger.ONE);
                if (m.isProbablePrime(10)) {
                    System.out.println(i + "\t\t" + m);
                }
            }
        }
    }
}
