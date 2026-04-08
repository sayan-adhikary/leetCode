class Solution {
    public double myPow(double x, int n) {
        // Convert n to long to avoid overflow
        long num = n;

        // If n is negative
        if (num < 0) {
            // Calculate the power of -n and take reciprocal
            return (1.0 / power(x, -num));
        }
        // If n is non-negative
        return power(x, num);
    }

    private double power(double x, long n) {
        // Base case: anything raised to 0 is 1
        if (n == 0)
            return 1.0;

        // Base case: anything raised to 1 is itself
        if (n == 1)
            return x;

        // If 'n' is even
        if (n % 2 == 0) {
            // Recursive call: (x * x), n / 2
            return power(x * x, n / 2);
        }
        // If 'n' is odd
        return x * power(x, n - 1);
    }
}