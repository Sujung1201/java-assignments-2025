import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class ArrayBounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = rand.nextInt(100);
        }

        try {
            System.out.print("Enter an index: ");
            int index = input.nextInt();
            System.out.print("Value at index is: " + array[index]);
        } catch (InputMismatchException e) {
            System.out.println("Incorrect data type");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        }
    }
}
