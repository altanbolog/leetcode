package leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * Description: 873. Length of Longest Fibonacci Subsequence
 *
 * @author Baltan
 * @date 2019-09-12 09:25
 */
public class LenLongestFibSubseq {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(lenLongestFibSubseq(A1));

        int[] A2 = {1, 3, 7, 11, 12, 14, 18};
        System.out.println(lenLongestFibSubseq(A2));
    }

    public static int lenLongestFibSubseq(int[] A) {
        int result = 0;
        int length = A.length;
        Set<Integer> set = new HashSet<>();

        for (int num : A) {
            set.add(num);
        }

        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                int len = 2;
                int prev = A[i];
                int next = A[j];

                while (set.contains(prev + next)) {
                    len++;
                    int sum = prev + next;
                    prev = next;
                    next = sum;
                }

                if (len > 2) {
                    result = Math.max(result, len);
                }
            }
        }
        return result;
    }
}
