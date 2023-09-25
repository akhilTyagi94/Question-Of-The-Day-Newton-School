/*

Make Words Equal
Time Limit: 2, Memory Limit: 256000

You are given two strings X and Y. You need to find the minimum number of characters to change in X so that Y is a substring of X.

Input:
The first line of the input contains a single string X.
The second line of the input contains a single string Y.

Constraints:
1 <= |Y| <= |X| <= 100
X and Y contains only lowercase characters

Output:
Output the answer
 */

import java.util.Scanner;

public class Make_Word_Equal_25_September_2023 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.nextLine();
        String Y = sc.nextLine();

        int minChanges = findMinChanges(X, Y);
        System.out.println(minChanges);
    }

    public static int findMinChanges(String X, String Y) {
        int minChanges = Y.length();

        for (int i = 0; i <= X.length() - Y.length(); i++) {
            String substring = X.substring(i, i + Y.length());
            int changesRequired = 0;

            for (int j = 0; j < Y.length(); j++) {
                if (substring.charAt(j) != Y.charAt(j)) {
                    changesRequired++;
                }
            }

            minChanges = Math.min(minChanges, changesRequired);
        }

        return minChanges;
    }
}
