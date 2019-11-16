package leetcode.algorithms;

/**
 * Description: 96. Unique Binary Search Trees
 *
 * @author Baltan
 * @date 2019-11-16 09:12
 */
public class NumTrees {
    public static void main(String[] args) {
        System.out.println(numTrees(0));
        System.out.println(numTrees(1));
        System.out.println(numTrees(2));
        System.out.println(numTrees(3));
        System.out.println(numTrees(4));
        System.out.println(numTrees(5));
    }

    public static int numTrees(int n) {
        if (n < 0) {
            return 1;
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        /**
         * 如果一棵二叉搜索树一共有i个节点，即二叉搜索树节点的值为1，2，……，i
         */
        for (int i = 2; i <= n; i++) {
            int count = 0;
            /**
             * 假设根节点的值为j，则左子树一共有j-1个节点，右子树一共有i-j个节点，此时二叉搜索树一共有
             * dp[j-1]*dp[i-j]种可能
             */
            for (int j = 1; j <= i; j++) {
                count += dp[j - 1] * dp[i - j];
            }
            dp[i] = count;
        }
        return dp[n];
    }
}
