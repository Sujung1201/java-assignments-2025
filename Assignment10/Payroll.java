import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = input.nextLine();
        System.out.println();

        File file = new File(fileName);
        Scanner reader = new Scanner(file);

        double salaries = 0;
        int count = 0;

        while (reader.hasNext()) {
            count++;
            if (count % 3 == 0) {
                double salary = reader.nextDouble();
                System.out.println(salary);
                salaries += salary;
            } else {
                System.out.print(reader.next() + " ");
            }
        }
        reader.close();
        input.close();

        double average = salaries * 3 / count;
        System.out.print("\nAverage: $" + average);
    }
}
