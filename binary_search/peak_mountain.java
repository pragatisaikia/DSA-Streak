

//852 & 162 : Peak Index in a Mountain Array : Medium
public class peak_mountain {
    public static void main(String[] args) {
        int arr[] = {0,2,1,0};
        int res = peakIndexInMountainArray(arr);
        System.out.println(res);
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
}
