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

        sort(arr);
    }

    static void sort(int[] arr){
        System.out.println(Arrays.toString(arr));

        //Initialize pivot and P Q
        int pivot = arr[0];
        int p = arr[1];
        int q = arr[arr.length - 1];
        int temp = 0;

        System.out.println(pivot + " " + p + " " + q );

        //check pivot and p
        if (pivot > p){
            temp = pivot;
            pivot = p;
            p = temp;
        } else {
            p = arr[i+1];
        }

        System.out.println(pivot + " " + p + " " + q + " ");

    };
}
