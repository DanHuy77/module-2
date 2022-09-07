package ss3_array_and_method.pratice;

public class FindMinInArrayByMethod {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int minIndex = findMin(arr);
        System.out.println("Min là: " + arr[minIndex]);
    }

    public static int findMin(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
