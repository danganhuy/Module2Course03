import java.util.Scanner;

public class StudentArray {
    public static void main(String[] args) {
        String[] students = {"Hà", "Chi", "Toàn", "Tuấn", "Thành", "Dũng", "Sơn", "Linh", "Minh", "Trinh"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student: ");
        String name = scanner.nextLine();
        name = name.replaceAll(" ", "");

        int found = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(name)) {
                found = i;
                break;
            }
        }
        if (found == -1) {
            System.out.println("Not found" + name + " in the list.");
        }
        else {
            System.out.println("Position of the students in the list " + name + " is: " + found);
        }
    }
}
