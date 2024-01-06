
import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted numsay : Medium
public class first_and_last_position {
    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 7, 7, 8, 10 };
        int target = 7;
        int ans[] = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));

    }

    public static int[] searchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };
        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);
        return ans;
    }

    public static int search(int[] nums, int target, boolean isStart) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (isStart == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
