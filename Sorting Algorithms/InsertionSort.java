//number of swaps reduced as comaprisor to bubble sort 
//it is stable

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] =  {2,4,1,6,3,8};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[], int last , int max){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
}
}
