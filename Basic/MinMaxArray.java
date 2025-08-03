package Basic;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 20 , 30, 40, 50, 60};
        int ans = solution(arr);
        System.out.println(ans);
    }

    static int solution(int[] arr){
        int min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[i+1]) {
                max = arr[i+1];
                min = arr[i];
            } else {
                min = arr[i+1];
                max = arr[i];
            }
        }

        return min & max;
    }
}

