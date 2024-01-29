import java.util.Arrays;

public class mismatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        int[] res = findErrorNums(nums);
        System.out.println(Arrays.toString(res));
    }
    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct] ) {
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return new int[]{nums[j],j+1};   
            }
        }
        return new int[]{-1,-1};  
    }

    public static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
