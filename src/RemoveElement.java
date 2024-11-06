import java.sql.Array;

public class RemoveElement {
    // [Bài tập] Xoá phần tử khỏi mảng
    public static void main(String[] args) {
        int[] nums = {3,5,77,23,4,21,19,0,42,5};
        int[] nums2 = removeElement(nums, 5);

        System.out.println("Array before removal: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("Array after removal: ");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
    public static int[] removeElement(int[] nums, int value) {
        int[] newNums = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                continue;
            }
            newNums[j++] = nums[i];
        }
        return newNums;
    }
}
