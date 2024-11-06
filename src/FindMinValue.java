public class FindMinValue {
    // [Thực hành] Tìm giá trị nhỏ nhất trong mảng sử dụng phương thức (v.2023)
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 27, 6, 9};
        int index = minValuePosition(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }
    public static int minValuePosition(int[] array){
        int index = 0;
        for (int i = 1;i<array.length;i++){
            if(array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }
}
