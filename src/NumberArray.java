import java.util.Scanner;

public class NumberArray {
    public static void displayArray(double[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.printf("%6.3f", array[row][col]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void randomElement(double[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = Math.random() * 10;
            }
        }
    }

    public static void addElement(double[][] array) {
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.printf("Enter element %d-%d: ", row, col);
                array[row][col] = scanner.nextDouble();
            }
        }
    }

    public static double sumDiagonal(double[][] array) {
        double total = 0;
        for (int row = 0, col = 0; row < array.length; row++, col++) {
            total += array[row][col];
        }
        return total;
    }
}
