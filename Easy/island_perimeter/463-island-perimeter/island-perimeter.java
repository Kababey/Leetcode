class Solution {
    public int islandPerimeter(int[][] grid) {
        int blockCount = 0, edgeCount = 0;
        
        for (int i = 0; i < grid.length; i++) { // Use.length for array size
            for (int j = 0; j < grid[i].length; j++) { // Correctly access array length
                if (grid[i][j] == 1) {
                    blockCount++;
                    int top = 0, down = 0, right= 0, left = 0;
                    if (i + 1 < grid.length) { // Check bounds properly
                        right = grid[i + 1][j];
                    }
                    if (i > 0) { // Adjusted condition
                        left = grid[i - 1][j];
                    }
                    if (j + 1 < grid[i].length) { // Adjusted condition
                        top = grid[i][j + 1];
                    }
                    if (j > 0) { // Adjusted condition
                        down = grid[i][j - 1];
                    }
                    edgeCount += countEdge(right, left, top, down);
                }
            }
        }
        return blockCount * 4 - edgeCount;
    }

    private int countEdge(int right, int left, int top, int down) {
        int edge = 0;
        if (right == 1) edge++;
        if (left == 1) edge++;
        if (top == 1) edge++;
        if (down == 1) edge++;
        return edge;
    }
}