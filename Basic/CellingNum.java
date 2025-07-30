package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class CellingNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elem sorted : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Enter elem to search : ");

        int target = in.nextInt();
        int ans = binarySearch(arr, target);

        System.out.println("The celling of the number is " + ans);
    }

    //Return the elem greater than target if target not found
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target == arr[mid]){
                return mid; // Target found, it's its own ceiling
            }
            if (isAsc){
                if (target < arr[mid]){
                    end = mid - 1;
                }
                else { // target > arr[mid]
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid]){
                    start = mid + 1;
                }
                else { // target > arr[mid]
                    end = mid - 1;
                }
            }
        }
        return start;
    }
}
