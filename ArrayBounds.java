import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class ArrayBounds {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100);
        }

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter an index: ");
            int index = input.nextInt();
            System.out.println("Value at index is: " + array[index]);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}
