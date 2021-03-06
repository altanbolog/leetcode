package leetcode.algorithms;

/**
 * Description: 999. Available Captures for Rook
 *
 * @author Baltan
 * @date 2019-03-12 10:54
 */
public class NumRookCaptures {
    public static void main(String[] args) {
        char[][] board1 = {{'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'R', '.', '.', '.', 'p'}, {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}};
        System.out.println(numRookCaptures(board1));

        char[][] board2 = {{'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'}, {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
                {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'}, {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}};
        System.out.println(numRookCaptures(board2));

        char[][] board3 = {{'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'p', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', 'B', '.', '.', '.', '.'},
                {'.', '.', '.', 'p', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}};
        System.out.println(numRookCaptures(board3));
    }

    public static int numRookCaptures(char[][] board) {
        int result = 0;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'R') {
                    int k1 = j - 1;
                    int k2 = j + 1;
                    int k3 = i - 1;
                    int k4 = i + 1;
                    /**
                     * 车一直向左走
                     */
                    while (k1 >= 0 && board[i][k1] == '.') {
                        k1--;
                    }

                    if (k1 >= 0 && board[i][k1] == 'p') {
                        result++;
                    }
                    /**
                     * 车一直向右走
                     */
                    while (k2 < 8 && board[i][k2] == '.') {
                        k2++;
                    }

                    if (k2 < 8 && board[i][k2] == 'p') {
                        result++;
                    }
                    /**
                     * 车一直向上走
                     */
                    while (k3 >= 0 && board[k3][j] == '.') {
                        k3--;
                    }

                    if (k3 >= 0 && board[k3][j] == 'p') {
                        result++;
                    }
                    /**
                     * 车一直向下走
                     */
                    while (k4 < 8 && board[k4][j] == '.') {
                        k4++;
                    }

                    if (k4 < 8 && board[k4][j] == 'p') {
                        result++;
                    }
                    /**
                     * 因为棋盘上只有一个"车"，找到就可以直接返回结果了
                     */
                    return result;
                }
            }
        }
        return result;
    }
}
