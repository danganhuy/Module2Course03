import java.sql.SQLOutput;
import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String str = "abcawkenfgsbeffFAmkMEICamsdhv";
        char ch = 'f';
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        System.out.println("Số lần ký tự " + ch + " xuất hiện: " + count);
    }
}
