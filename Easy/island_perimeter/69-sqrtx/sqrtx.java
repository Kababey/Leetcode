class Solution {
public int mySqrt(int x) {
    if (x < 0) throw new IllegalArgumentException("Negative input");
    
    // Handle edge cases
    if (x == 0 || x == 1) return x;

    int start = 1;
    int end = x / 2; // Start searching from half of x

    while (start <= end) {
        int mid = start + (end - start) / 2;
        long square = (long) mid * mid; // Cast to long to avoid overflow

        if (square == x) {
            return mid;
        } else if (square < x) {
            start = mid + 1;
        } else {
            end = mid - 1;
        }
    }

    return end; // Return the largest integer whose square is less than or equal to x
}
}