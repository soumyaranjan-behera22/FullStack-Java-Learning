package DSA;

public class ManInAGrid {
    static void pathCount(int sr, int sc, int er, int ec, String path, boolean[][] visited) {
        // Base case: if out of bounds
        if (sr < 0 || sc < 0 || sr > er || sc > ec) {
            return;
        }

        // Base case: if already visited
        if (visited[sr][sc]==true) {
            return;
        }

        // Base case: reached destination
        if (sr == er && sc == ec) {
            System.out.println(path);
            return;
        }

        // Mark current cell as visited
        visited[sr][sc] = true;

        // Explore all four directions recursively
        // Down
        if (sr + 1 <= er && !visited[sr + 1][sc]) {
            pathCount(sr + 1, sc, er, ec, path + "D", visited);
        }

        // Right
        if (sc + 1 <= ec && !visited[sr][sc + 1]) {
            pathCount(sr, sc + 1, er, ec, path + "R", visited);
        }

        // Up
        if (sr - 1 >= 0 && !visited[sr - 1][sc]) {
            pathCount(sr - 1, sc, er, ec, path + "U", visited);
        }

        // Left
        if (sc - 1 >= 0 && !visited[sr][sc - 1]) {
            pathCount(sr, sc - 1, er, ec, path + "L", visited);
        }

        // Backtrack: unmark current cell before returning
        visited[sr][sc] = false;
    }

    // Alternative version that counts all possible paths
    static int countAllPaths(int sr, int sc, int er, int ec, boolean[][] visited) {
        // Base case: if out of bounds
        if (sr < 0 || sc < 0 || sr > er || sc > ec) {
            return 0;
        }

        // Base case: if already visited
        if (visited[sr][sc]) {
            return 0;
        }

        // Base case: reached destination
        if (sr == er && sc == ec) {
            return 1;
        }

        // Mark current cell as visited
        visited[sr][sc] = true;

        // Explore all four directions and count paths
        int count = 0;
        count += countAllPaths(sr + 1, sc, er, ec, visited); // Down
        count += countAllPaths(sr, sc + 1, er, ec, visited); // Right
        count += countAllPaths(sr - 1, sc, er, ec, visited); // Up
        count += countAllPaths(sr, sc - 1, er, ec, visited); // Left

        // Backtrack: unmark current cell
        visited[sr][sc] = false;

        return count;
    }

    public static void main(String[] args) {
        int er = 3;
        int ec = 3;
        boolean[][] visited = new boolean[er + 1][ec + 1];

        System.out.println("All paths from (1,1) to (3,3):");
        pathCount(1, 1, er, ec, "", visited);

        System.out.println("\nTotal number of paths: " + countAllPaths(1, 1, er, ec, visited));
    }
}