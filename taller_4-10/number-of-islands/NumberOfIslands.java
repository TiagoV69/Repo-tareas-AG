class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int filas = grid.length;
        int columnas = grid[0].length;
        int contadorIslas = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (grid[i][j] == '1') {
                    contadorIslas++;
                    visitarIsla(grid, i, j);
                }
            }
        }

        return contadorIslas;
    }

    private void visitarIsla(char[][] grid, int i, int j) {
        int filas = grid.length;
        int columnas = grid[0].length;

        if (i < 0 || j < 0 || i >= filas || j >= columnas || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';

        // por si algo
        visitarIsla(grid, i - 1, j); // Arriba
        visitarIsla(grid, i + 1, j); // Abajo
        visitarIsla(grid, i, j - 1); // Izquierda
        visitarIsla(grid, i, j + 1); // Derecha
    }
}