/*

Multiple Of 7

Time Limit: 2, Memory Limit: 256000

Yash loves the number 7 and multiples of K. Where is the first occurrence of a multiple of K in the sequence 7, 77, 777, …? If the sequence contains no multiples of K, print -1 instead.

Input
The input consists of an integer K.

Constraints
1 ≤ K ≤ 106

Output
Print an integer representing the position of the first occurrence of a multiple of K.

 */

import java.util.Scanner;

public class Multiple_Of_7_01_October_2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();

        int num = 7;
        int iteration = 1;
        boolean found = false;

        while (true) {
            if (num % K == 0) {
                found = true;
                break;
            }

            num = num * 10 + 7;
            iteration++;

            // If the sequence becomes too large without finding a multiple of K, exit
            if (iteration > 100000) {
                break;
            }
        }

        if (found) {
            System.out.println(iteration);
        } else {
            System.out.println("-1");
        }
    }
}
