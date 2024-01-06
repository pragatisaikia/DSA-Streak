import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,16,16}
        };
        int target = 2;
        int[] res = search(mat, target);
        System.out.println(Arrays.toString(res));
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[] { row, mid };
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[] { -1, -1 };
    }

    static int[] search(int[][] mat, int target) {
        int rows = mat.length;
        int cols = mat[0].length;
        if (rows == 1) {
            return binarySearch(mat, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cmid = cols / 2;

        while (rStart < (rEnd - 1)) { // until two rows are remaining
            int mid = rStart + (rEnd - rStart) / 2;
            if (mat[mid][cmid] == target) {
                return new int[] { mid, cmid };
            }
            if (mat[mid][cmid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows and have to check if the target element is in the middle
        // column
        if (mat[rStart][cmid] == target) {
            return new int[] { rStart, cmid };
        }
        if (mat[rStart + 1][cmid] == target) {
            return new int[] { rStart + 1, cmid };
        }

        if (target <= mat[rStart][cmid - 1]) {
            return binarySearch(mat, rStart, 0, cmid - 1, target);
        }
        if (target >= mat[rStart][cmid + 1] && target <= mat[rStart][cols - 1]) {
            return binarySearch(mat, rStart, cmid + 1, cols - 1, target);
        }
        if (target <= mat[rStart + 1][cmid - 1]) {
            return binarySearch(mat, rStart + 1, 0, cmid - 1, target);
        } else {
            return binarySearch(mat, rStart + 1, cmid + 1, cols - 1, target);

        }
    }
}
