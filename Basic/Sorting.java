package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int size = in.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the array elems : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }

        sort(arr, 0, arr.length-1);
    }

    public  static void sort(int[] arr, int low, int high){
        if (low<high){
            sort(arr, low, );
            sort(arr, , high);
        }
    };
}
