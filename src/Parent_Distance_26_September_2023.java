/*

Parent Distance

Time Limit: 2, Memory Limit: 256000

There are N people, called Person 1, Person 2, …, Person N. The parent of Person i (2 ≤ i ≤ N) is Person Pi. Here, it is guaranteed that Pi < i.
How many generations away from Person N is Person 1?

Input
The first line of the input consists of an integer N. The second line consists of N space separated integers.
N
P1 P2 P3.. PN

Constraints
2 ≤ N ≤ 50
1 ≤ Pi < i(2 ≤ i ≤ N)
All values in input are integers.

Output
Print the answer as a positive integer.

 */

import java.util.Scanner;

public class Parent_Distance_26_September_2023 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] parents = new int[N - 1];

        for (int i = 0; i < N - 1; i++) {
            parents[i] = sc.nextInt();
        }

        int generationsAway = calculateGenerationsAway(N, parents);

        System.out.println(generationsAway);
    }

    public static int calculateGenerationsAway(int N, int[] parents) {
        int generationsAway = 0;
        int currentPerson = N;

        while (currentPerson != 1) {
            generationsAway++;
            currentPerson = parents[currentPerson - 2];
        }

        return generationsAway;
    }
}
