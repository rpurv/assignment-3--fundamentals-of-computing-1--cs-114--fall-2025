import java.util.Scanner;

public class Diamond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a integer for the diamond size: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Size cannot be a negative integer.");
            scanner.close();
            return;
        }

        int center = size / 2; // where the diamond is widest

        for (int row = 0; row < size; row++) {

            int distance = Math.abs(center - row); // how far this row is from the middle
            int numStars = size - 2 * distance;
            int numSpaces = distance;

            for (int i = 0; i < numSpaces; i++) {
                System.out.print(" ");
            }

            for (int i = 0; i < numStars; i++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}
