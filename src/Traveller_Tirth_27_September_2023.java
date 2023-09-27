/*

Traveller Tirth

Time Limit: 2, Memory Limit: 256000

Tirth loves travelling and he plans to visit n places in his vacations. He consults with his friends, and they suggest n fascinating places he should visit. However, each of these places comes with a unique rating given by his friends, ranging from low to high. Tirth decides that he wants to visit these places in ascending order based on their ratings, starting from the least rated destination and culminating at the most highly rated one.

Your task is to help Tirth determine the order in which he should visit these n places based on their ratings.

Input

Input consists of 2 lines:

The first line contains a single integer n, representing the number of places he plans to visit.
The second line contains n space- separated integers r1, r2,. , rn, each representing the unique rating of the ith place.

Constraints
1 ≤ n ≤ 10^5
1 ≤ r[i] ≤ 10^9, 1 <= i <= n

Output

Print n space- separated integers. These integers should represent the places (1- based index) in the order Tirth should visit them based on their ratings.

 */

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Traveller_Tirth_27_September_2023 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ratings = new int[n];

        for(int i=0; i<n; i++) {
            ratings[i] = sc.nextInt();
        }

        int[] visitingOrder = determineVisitingOrder(ratings);

        for(int i=0; i<n; i++) {
            System.out.print(visitingOrder[i] + " ");
        }
    }

    public static int[] determineVisitingOrder(int[] ratings) {
        int n = ratings.length;

        TreeMap<Integer, Integer> ratingToIndex = new TreeMap<>();

        for(int i=0; i<n; i++) {
            ratingToIndex.put(ratings[i], i+1);
        }

        int[] visitOrder = new int[n];
        int i=0;

        for(int placeIndex : ratingToIndex.values()) {
            visitOrder[i] = placeIndex;
            i++;
        }

        return visitOrder;
    }
}
