

//Binary search in 2d array

import java.sql.Array;
import java.util.Arrays;

public class Bs_in_2d {
    public static void main(String[] args) {
        
        int[][] array = {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target = 37;
        int res[] = binary_search(array, target);
        System.out.println(Arrays.toString(res));
        
    }

    public static int[] binary_search(int[][] mat, int target){
        int r = 0;
        int c = mat.length - 1;
        while (r < mat.length && c >= 0) {
            if (mat[r][c] == target) {
                return new int[]{r,c};
            }else if (mat[r][c] > target) {
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
}

}
