package Blatt8.Compute;
public class Compute {
    public int rec(int n, int x, int y) {
        if (n == 0) {
            return x + y;
        }
        if (y == 0) {
            return x;
        }
        return rec(n - 1, rec(n, x, y - 1), rec(n, x, y - 1) + y);
    }
}