public class Matrix {

    // Grid Data 
    private int[][] grid;

    // Highlight colors.
    private static final String HIGHLIGHT = "\u001B[43m";
    private static final String RESET = "\u001B[0m";

    public Matrix(int size) {
        grid = new int[size][size];
        System.out.println("Created a " + size + " x " + size + " matrix.");
    }

    // Swaps two positions inside the matrix.
    private void swap(int row1, int col1, int row2, int col2) {
        int temp = grid[row1][col1];
        grid[row1][col1] = grid[row2][col2];
        grid[row2][col2] = temp;
    }

    // Fills the matrix with 1, 2, 3... in row-major order.
    public void populateMatrix() {
        int value = 1;
        int size = grid.length;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                grid[row][col] = value++;
            }
        }
    }

    // Flip everything EXCEPT the anti-diagonal (top-right → bottom-left).
    public void flipMatrix() {
        int size = grid.length;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                // Only flip values on one side of the anti-diagonal.
                if (col < size - 1 - row) {

                    // Coordinates of the matching cell across the diagonal.
                    int mirrorRow = size - 1 - col;
                    int mirrorCol = size - 1 - row;

                    swap(row, col, mirrorRow, mirrorCol);
                }
            }
        }
    }

    // Print the matrix and highlight the anti-diagonal.
    public void printMatrix() {
        int size = grid.length;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {

                boolean isDiagonal = (row + col == size - 1);

                if (isDiagonal) {
                    System.out.printf(HIGHLIGHT + "%4d" + RESET, grid[row][col]);
                } else {
                    System.out.printf("%4d", grid[row][col]);
                }
            }
            System.out.println();
        }
    }
}
