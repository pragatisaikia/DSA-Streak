//cyclic sort question
//leetcode 268 : easy
//amazon question
 public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1,4};
        int res = missingNumber(arr);
        System.out.println(res);
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correct] ) {
                swap(nums, i, correct);
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
                return j;   
            }
        }

        return nums.length;
    }

    static void swap(int arr[], int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
 }


//without cycle sort takes 0ms although both of the approach have time complexity O(n)
        // int n = nums.length;
        // int sum1 = (n*(n+1)) /2;

        // int sum2 = 0;
        // for(int num: nums){
        //     sum2 += num;
        // }

        // int miss = sum1 - sum2;

        // return miss;