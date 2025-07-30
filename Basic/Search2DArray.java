package Basic;

import java.util.Arrays;

public class Search2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {2, 5, 6},
                {89324, 20, 342},
                {432, 4353, 23},
                {54, 43, 32}
        };

        int target = 342;
        for (int[] array : arr) {
            System.out.println(Arrays.toString(array));
        }
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        //search in array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
