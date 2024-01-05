package binary_search;
//33. Search in Rotated Sorted Array : Medium
public class RotatedBS {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 3;
        int res = search(arr,target);
        System.out.println(res);
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pivot = pivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, target, start, end);
        }

        //case 1
        if (target == nums[pivot]) {
            return pivot;
        }
        //case 2
        if (target >= nums[start]) {
            return binarySearch(nums, target, start, pivot - 1);
        }
        //case3
        if (target < nums[start]) {
            return binarySearch(nums, target, pivot + 1, end);
        }
        return -1;
    }

    public static int pivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] < arr[start]) {
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int pivotDuplicates(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if(arr[start] == arr[mid] && arr[start] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start;
                }
                start++;
                if(arr[end] < arr[end - 1]){
                    return end - 1;
                }
                end--;


            }else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }
        return -1;
    }

    

    public static int binarySearch(int[] arr, int target,int start,int end){
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
