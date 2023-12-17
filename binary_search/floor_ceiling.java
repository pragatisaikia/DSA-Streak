package binary_search;

//Given a sorted array. Find the smallest number greater than the target and the greatest number smaller than the target

public class floor_ceiling {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 6, 12, 16, 17, 20 };
        int target = 15;
        int ceil = ceiling(arr, target);
        int flr = floor(arr, target);
        System.out.println("Ceiling of the number in the array : " + ceil);
        System.out.println("Floor of the number in the array : " + flr);
    }

    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[start];
    }

    public static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[end];
    }
}
