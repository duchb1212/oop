public class CharGrid {
    private char[][] grid;
    private int cols;
    private int rows;

    public CharGrid(char[][] grid) {

        this.grid = grid;
        this.rows = grid.length;
        this.cols = grid.length > 0 ? grid[0].length : 0;
    }



    public int charArea(char ch) {
        int minR = Integer.MAX_VALUE, maxR = Integer.MIN_VALUE;
        int minC = Integer.MAX_VALUE, maxC = Integer.MIN_VALUE;
        boolean found = false;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == ch) {
                    found = true;
                    if (r < minR) minR = r;
                    if (r > maxR) maxR = r;
                    if (c < minC) minC = c;
                    if (c > maxC) maxC = c;
                }
            }
        }
        if (!found) return 0;
        return (maxR - minR + 1) * (maxC - minC + 1);
    }



    private int armLen(int r, int c, int dr, int dc) {
        char ch = grid[r][c];
        int cnt = 0;
        int rr = r, cc = c;
        while (rr >= 0 && rr < rows && cc >= 0 && cc < cols && grid[rr][cc] == ch) {
            cnt++;
            rr += dr;
            cc += dc;
        }
        return cnt;
    }

    public int countPlus() {
        int count = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                char ch = grid[r][c];
                int up = armLen(r, c, -1, 0);
                int down = armLen(r, c, 1, 0);
                int left = armLen(r, c, 0, -1);
                int right = armLen(r, c, 0, 1);
                if (up >= 2 && down >= 2 && left >= 2 && right >= 2) {
                    if (up == down && up == left && up == right) count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        char[][] grid = new char[][] {
                {'c','a','x'},
                {'b',' ','b'},
                {' ',' ','a'}
        };
        CharGrid cg = new CharGrid(grid);
        System.out.println(cg.charArea('a'));// expect 3x? based on example -> prints 3? (rows x cols calculation)
    }
}
