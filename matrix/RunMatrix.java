import java.util.Scanner;

public class RunMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer for the matrix size: ");
        int size = scanner.nextInt();

        while (size <= 0) {
            System.out.print("Size cannot be negative. Enter again: ");
            size = scanner.nextInt();
        }

        Matrix matrix = new Matrix(size);

        System.out.println("\nMatrix when first created (all zeros):");
        matrix.printMatrix();

        matrix.populateMatrix();
        System.out.println("\nMatrix after filling it with values:");
        matrix.printMatrix();

        matrix.flipMatrix();
        System.out.println("\nMatrix after flipping across the diagonal:");
        matrix.printMatrix();

        scanner.close();
    }
}
