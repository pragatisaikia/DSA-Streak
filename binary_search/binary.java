
// Binary search code
public class binary {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,20,54,99};
        int target = -2;
        int result = binarySearch(arr, target);
        System.out.println("Result : " + result);
    }

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }else if (target > arr[mid]) {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}