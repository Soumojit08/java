package Basic;

import java.util.Arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 20 , 30, 40, 50, 60};
        int[] ans = solution(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] solution(int[] arr){
        int min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[]{min, max};
    }
}

