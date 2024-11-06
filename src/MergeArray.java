public class MergeArray {
    // [Bài tập] Gộp mảng
    public static void main(String[] args) {
        int[] a = {23,22,3,4,5,7,9};
        int[] b = {12,55,31};
        int[] c = mergeArray(a, b);

        System.out.println("Dãy 1: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nDãy 2: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\nDãy gộp: ");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
    public static int[] mergeArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        for (int j = 0; j < a.length; j++) {
            c[i++] = a[j];
        }
        for (int j = 0; j < b.length; j++) {
            c[i++] = b[j];
        }
        return c;
    }
}
