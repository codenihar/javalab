import java.util.*;

class Poly {
    // Function to calculate factorial of N
    static int fact(int n) {
        // Base Case
        if (n == 1 || n == 0)
            return 1;
        // Otherwise, recursively calculate the factorial
        else
            return n * fact(n - 1);
    }

    // Function to find the value of P(n + r) for polynomial P(X)
    static int findValue(int n, int r, int a) {
        // Stores the value of k
        int k = (a - 1) / fact(n);
        // Store the required answer
        int answer = k;
        // Iterate in the range [1, N] and multiply (n + r - i) with answer
        for (int i = 1; i < n + 1; i++)
            answer = answer * (n + r - i);
        // Add the constant value C as 1
        answer = answer + 1;
        // Return the result
        return answer;
    }

    // Driver Code
    public static void main(String args[]) {
        int N = 1;
        int A = 2;
        int R = 3;
        System.out.print(findValue(N, R, A));
    }
}
