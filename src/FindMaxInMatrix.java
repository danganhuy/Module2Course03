import java.util.Scanner;

public class FindMaxInMatrix {
    // [Bài tập] Tìm phần tử lớn nhất trong mảng hai chiều
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {
                {1, 4, 6, 23, 18},
                {7, 91, 34, 82, 2},
                {25, 26, 9, 33, 19},
                {31, 20, 56, 8, 0},
        };
        int[] cor = findMaxInMatrix(matrix);
        System.out.println("Giá trị lớn nhất của ma trận là " + matrix[cor[0]][cor[1]] + " ở cột " + cor[0] + " hàng " + cor[1] + ".");
    }
    public static int[] findMaxInMatrix(int[][] matrix) {
        int max = matrix[0][0];
        int row = 0;
        int col = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        return new int[]{row,col};
    }
}
