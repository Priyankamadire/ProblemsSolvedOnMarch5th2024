
/*
 * A tenth standard student has been given a task, Given P number of subject marks 
and a number I, He has to print the I-th least value of sums among all the 
possible sub-arrays of marks.
Input Format:
-------------
Line-1: Two space separated inetegers, P and I.
Line-2: P space separated integers, marks[].

Output Format:
--------------
Print the I-th least value of possible sums.

Sample Input-1:
--------------
3 4
3 2 4

Sample output-1:
---------------
5

Explanation: 
------------
The subarrays of 3 2 4 are:
1st subarray: 3 the sum is 3
2nd subarray: 2 the sum is 2
3rd subarray: 4 the sum is 4
4th subarray: 3,2 the sum is 5
5th subarray: 2,4 the sum is 6
6th subarray: 3,2,4 the sum is 9

The 4th smallest is 5

Sample Input-2:
---------------
4 7
2 2 4 4

Sample output-2:
----------------
8

Explanation: 
------------
The subarrays of 2 2 4 4 are

1st subarray: 2 the sum is 2
2nd subarray: 2 the sum is 2
3rd subarray: 4 the sum is 4
4th subarray: 4 the sum is 4
5th subarray: 2,2 the sum is 4
6th subarray: 2,4 the sum is 6
7th subarray: 4,4 the sum is 8
8th subarray: 2,2,4 the sum is 8
9th subarray: 2,4,4 the sum is 10
10th subarray: 2,2,4,4 the sum is 12

The 7th smallest is 8
 */
import java.util.*;

public class kthSubArraySum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solve(n, m, arr));
    }

    public static int solve(int n, int m, int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                al.add(sum);
            }
        }
        System.out.print(al);
        Collections.sort(al);
        if (n <= al.size()) {
            return al.get(m - 1);
        }
        return 0;
    }
}