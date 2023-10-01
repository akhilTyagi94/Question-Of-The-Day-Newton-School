/*

Simple Arrangement

Time Limit: 2, Memory Limit: 256000

Given an array A (0 indexed) of n integers from 0 to n-1 (each integer exactly once), output an array such that A[i] becomes A[A[i]].

Make sure you don't use extra memory than the array itself.

Input
The first line of the input contains a number n, the number of integers in the array.
The second line of the input contains n numbers, the elements of A.

Constraints:
1 <= n <= 100000
0 <= A[i] <= n-1

Output
Output the required array of n integers.

 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Simple_Arrangement_30_September_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        rearrangeArray(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;

        // Encode the array: A[i] becomes A[i] + A[A[i]] * n
        for (int i = 0; i < n; i++) {
            arr[i] += (arr[arr[i]] % n) * n;
        }

        // Decode the encoded array to get the rearranged array
        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }
    }
}
