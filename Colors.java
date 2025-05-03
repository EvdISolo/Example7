import java.util.Random;

public class Colors {
    private static final int SIZE = 8;

    public static void main(String[] args) {
        int[][] matrix = createMatrix(SIZE,SIZE);
        System.out.println("Оригинальные цвета");
        printMatrix(matrix);

        int[][] rotatedMatrix = rotate(matrix);


        System.out.println("Певернутые цвета");
        printMatrix(rotatedMatrix);
    }

    private static int[][] rotate(int[][] matrix) {
        int size = matrix.length;
        int[][] rotated = new int[size][size];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                rotated[i][j] = matrix[SIZE - 1-j ][i];

            }

        }
        return rotated;
    }
    private static int[][] createMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(256);
            }
        }

        return matrix;
    }



    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();

        }
    }
}


