package leetcode.algorithms;

/**
 * Description: 365. Water and Jug Problem
 *
 * @author Baltan
 * @date 2019-06-27 15:13
 */
public class CanMeasureWater {
    public static void main(String[] args) {
        System.out.println(canMeasureWater(3, 5, 4));
        System.out.println(canMeasureWater(2, 6, 5));
        System.out.println(canMeasureWater(3, 0, 2));
        System.out.println(canMeasureWater(0, 0, 0));
        System.out.println(canMeasureWater(2, 0, 2));
        System.out.println(canMeasureWater(1, 1, 1));
        System.out.println(canMeasureWater(2, 0, 5));
    }

    /**
     * 参考：
     * <a href="https://leetcode-cn.com/problems/water-and-jug-problem/solution/shui-hu-wen-ti-by-leetcode-solution/"></a>
     *
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static boolean canMeasureWater(int x, int y, int z) {
        if (z == 0) {
            return true;
        }

        if (z < 0 || x + y < z) {
            return false;
        }

        if (x == 0) {
            return y == z;
        }

        if (y == 0) {
            return x == z;
        }

        int max = Math.max(x, y);
        int min = Math.min(x, y);

        while (max % min != 0) {
            int remainder = max % min;
            max = min;
            min = remainder;
        }
        return z % min == 0;
    }
}
