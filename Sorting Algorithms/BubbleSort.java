import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] =  {2,4,1,6,3,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j <= array.length - i - 1; j++) {
                if (array[j-1] > array[j]) {
                    int temp = array[j-1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

}
