import java.util.Scanner;

public class KeepReal {
    public static double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Invalid input: x is negative: " + x);
        }
        return Math.sqrt(x);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num = input.nextDouble();

        try {
            System.out.println("squareRoot(" + num + ") = " + squareRoot(num));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
