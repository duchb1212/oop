public class TetrisGrid {
    private boolean[][] grid;
    private int width;
    private int height;


    public TetrisGrid(boolean[][] grid) {

        this.width = grid.length;
        this.height = grid[0].length;

        this.grid = new boolean[width][height];
        for (int x = 0; x < width; x++) {
            if (grid[x].length != height) throw new IllegalArgumentException("Jagged columns not supported");
            System.arraycopy(grid[x], 0, this.grid[x], 0, height);
        }
    }



    public void clearRows() {
        for (int y = 0; y < height; y++) {
            if (isFullRow(y)) {
                for (int yy = y; yy < height - 1; yy++) {
                    for (int x = 0; x < width; x++) {
                        grid[x][yy] = grid[x][yy + 1];
                    }
                }
                for (int x = 0; x < width; x++) grid[x][height - 1] = false;
                y--;
            }
        }
    }


    private boolean isFullRow(int y) {
        for (int x = 0; x < width; x++) {
            if (!grid[x][y]) return false;
        }
        return true;
    }


    public boolean[][] getGrid() {
        return grid;
    }



    public static void main(String[] args) {
        boolean[][] g = new boolean[][] {
                {false, false, true}, // x=0
                {true, true, false} // x=1
        };
        TetrisGrid tg = new TetrisGrid(g);
        tg.clearRows();
        boolean[][] res = tg.getGrid();
        for (int y = res[0].length - 1; y >= 0; y--) {
            for (int x = 0; x < res.length; x++) System.out.print(res[x][y] ? 'X' : '.');
            System.out.println();
        }
    }
}
