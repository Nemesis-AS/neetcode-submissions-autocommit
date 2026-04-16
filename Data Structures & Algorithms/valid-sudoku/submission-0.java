class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] map = new int[3][9];

        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                int c = board[y][x] - '0';
                if (c < 0) continue;

                int id = 1 << c;
                int sub = (int)(y / 3) * 3 + (int)(x / 3);

                if ((map[0][y] & id) > 0 || (map[1][x] & id) > 0 || (map[2][sub] & id) > 0)
                    return false; 

                map[0][y] |= id;
                map[1][x] |= id;
                map[2][sub] |= id;
            }
        }

        return true;
    }
}
