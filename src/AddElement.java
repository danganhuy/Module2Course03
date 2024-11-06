public class AddElement {
    // [Bài tập] Thêm phần tử vào mảng
    public static void main(String[] args) {
        int[] nums = {3,5,77,23,4,21,19,0,42,5};
        int[] nums2 = addElement(nums, 69, 3);

        System.out.println("\nArray before add: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nArray after add: ");
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }
    public static int[] addElement(int[] nums, int value, int index) {
        if (index >= nums.length - 1 || index < 0) {
            return null;
        }
        int[] nums2 = new int[nums.length + 1];
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i == index) {
                nums2[j++] = value;
            }
            nums2[j++] = nums[i];
        }
        return nums2;
    }
}
