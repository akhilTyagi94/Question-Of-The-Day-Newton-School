/*
Add or Subtract
Time Limit: 2, Memory Limit: 256000

You are given two numbers X and Y.

If X is a divisor of Y, then print X + Y or else print Y - X.

Input
The first line of the input contains 2 integers X and Y.

Constraints:
1 ≤ X ≤ Y ≤ 100

Output
Print the answer
 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Add_or_Subtract_24_September_2023 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(y%x == 0) {
            System.out.println(x+y);
        } else {
            System.out.println(y-x);
        }
    }
}