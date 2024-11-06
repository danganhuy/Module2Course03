import java.util.Scanner;

public class MatrixMainDiagonalTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the matrix size: ");
        int size = sc.nextInt();
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Enter row " + (i+1) + " column " + (j+1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your matrix: ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int total = 0;
        for (int i = 0; i < size; i++) {
            total += matrix[i][i];
        }
        System.out.println("Total of matrix main diagonal: " + total);
    }
}
