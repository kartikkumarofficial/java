package clg;

public class ConvoysGame {

    public static void main(String[] args) throws Exception {

        int rows = 25, cols = 25;
        int[][] grid = new int[rows][cols];
        int[][] next;

        // Initial pattern (blinker)
        grid[10][10] = 1;
        grid[10][11] = 1;
        grid[10][12] = 1;

        for (int gen = 0; gen < 20; gen++) {

            next = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {

                    int aliveNeighbors = 0;

                    for (int x = -1; x <= 1; x++) {
                        for (int y = -1; y <= 1; y++) {
                            if (x == 0 && y == 0) continue;
                            int r = i + x, c = j + y;

                            if (r >= 0 && r < rows && c >= 0 && c < cols)
                                aliveNeighbors += grid[r][c];
                        }
                    }

                    if (grid[i][j] == 1) {
                        next[i][j] = (aliveNeighbors == 2 || aliveNeighbors == 3) ? 1 : 0;
                    } else {
                        next[i][j] = (aliveNeighbors == 3) ? 1 : 0;
                    }
                }
            }

            printGrid(grid);
            grid = next;
            Thread.sleep(500);
        }
    }

    static void printGrid(int[][] g) {
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[0].length; j++) {
                System.out.print(g[i][j] == 1 ? "⬛" : "⬜");
            }
            System.out.println();
        }
        System.out.println();
    }
}
