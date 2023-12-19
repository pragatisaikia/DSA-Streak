
//1095. Find in Mountain Array : hard
public class findInMoutain {
    private static boolean Asc;

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        int res = search(arr, target);
        System.out.println(res);
    }

    public static int search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int first = binary_search(arr, target, 0, peak);
        if (first != -1) {
            return first;
        }else{
            binary_search(arr, target, peak, arr.length - 1);
        }
        return -1;
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start; //here we are returning the index of the peak element in the array
    }

    public static int binary_search(int[] arr, int target, int start,int end){
        boolean Asc;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (arr[start] < arr[end]) {
                Asc = true;
            }else{
                Asc = false;
            }

            if(Asc) {
              if (arr[mid] > target) {
                end = mid - 1;
              }else{
                start = mid + 1;
              }  
            }else{
                if (arr[mid] > target) {
                start = mid + 1;
              }else{
                end = mid - 1;
              }  
            }
        }
        return -1;
    }
}
