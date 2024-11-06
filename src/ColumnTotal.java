import java.util.Scanner;

public class ColumnTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter row " + (i+1) + " column " + (j+1) + ": ");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int columnChoice;
        do {
            System.out.print("Enter column you want to calculate total of: ");
            columnChoice = sc.nextInt();
            if (columnChoice < 0 || columnChoice > columns - 1) {
                System.out.println("Invalid input");
            }
            else {
                break;
            }
        } while (true);
        int total = 0;

        for (int i = 0; i < rows; i++) {
            total += matrix[i][columnChoice];
        }

        System.out.println("Total of elements in column " + columnChoice + " of matrix: " + total);
    }
}
