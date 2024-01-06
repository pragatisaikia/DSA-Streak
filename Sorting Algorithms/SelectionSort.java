import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] =  {2,4,1,6,3,8};
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = Max(arr,0,last);
            swap(arr, last, max);
        }
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int arr[], int last , int max){
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;
    }
    static int Max(int arr[], int start, int end){
        int max = start;
        for (int j = start; j < end; j++) {
            if (arr[j] > arr[max]) {
                max = j;
            }
        }
        return max;
    }
}
