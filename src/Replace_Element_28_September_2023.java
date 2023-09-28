/*

Replace Elements

Time Limit: 2, Memory Limit: 256000

You have an array a1, a2, …, an. All ai are positive integers. In one step you can choose three distinct indices i, j, and k (i≠j; i≠k; j≠k) and assign the sum of aj and ak to ai, i. e. make ai = aj + ak. Can you make all ai lower or equal to d using the operation above any number of times (possibly, zero)?

Input

The first line of the input consists of two space- separated integers n and d denoting the number of elements in the array a and the value d. The second line of the input consists of n space- separated integers a1, a2, …, an denoting the array a.

Constraints
3 ≤ n ≤ 100
1 ≤ d ≤ 100
1 ≤ ai ≤ 100

Output

Print Yes, if it's possible to make all elements ai less or equal than d using the operation above. Otherwise, print No.

 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Replace_Element_28_September_2023 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean possible = canMakeElementsLowerOrEqual(arr, n, d);

        if (possible) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static boolean canMakeElementsLowerOrEqual(int[] elements, int n, int d) {
        for (int i = 0; i < n; i++) {
            if (elements[i] > d) {
                boolean combinationFound = false;
                for (int j = 0; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (j != i && k != i && elements[j] + elements[k] <= d) {
                            combinationFound = true;
                            break;
                        }
                    }
                    if (combinationFound) {
                        break;
                    }
                }
                if (!combinationFound) {
                    return false;
                }
            }
        }

        return true;
    }
}
