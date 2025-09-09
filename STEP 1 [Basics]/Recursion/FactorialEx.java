public class FactorialEx {

    public static int factorial(int n) {

        if (n == 0) {
            return 1;
        }
        return (n * (factorial(n - 1)));

        // [OR]

        // int fac = 1;
        // for (int i = 1; i <= n; i++) {
        // fac = fac * i;
        // }
        // return fac;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}

// Let's go through the execution of sumOfNumbers(5) again, step by step, to see
// how the unwinding works:

// Initial Call: sumOfNumbers(5)

// Since n is not 0, it proceeds to the recursive case.
// It returns 5 * sumOfNumbers(4).
// Second Call: sumOfNumbers(4)

// Since n is not 0, it proceeds to the recursive case.
// It returns 4 * sumOfNumbers(3).
// Third Call: sumOfNumbers(3)

// Since n is not 0, it proceeds to the recursive case.
// It returns 3 * sumOfNumbers(2).
// Fourth Call: sumOfNumbers(2)

// Since n is not 0, it proceeds to the recursive case.
// It returns 2 * sumOfNumbers(1).
// Fifth Call: sumOfNumbers(1)

// Since n is not 0, it proceeds to the recursive case.
// It returns 1 * sumOfNumbers(0).
// Sixth Call: sumOfNumbers(0)

// This time, n is 0, which is the base case.
// It returns 1.
// Now, let's see how the unwinding process works:

// The result of sumOfNumbers(0) is 1.
// The result of sumOfNumbers(1) is 1 * 1 = 1.
// The result of sumOfNumbers(2) is 2 * 1 = 2.
// The result of sumOfNumbers(3) is 3 * 2 = 6.
// The result of sumOfNumbers(4) is 4 * 6 = 24.
// The result of sumOfNumbers(5) is 5 * 24 = 120.
// Explanation of the Unwinding Process
// When sumOfNumbers(0) returns 1, this value is passed back to the previous
// call sumOfNumbers(1), which then calculates 1 * 1 = 1.
// This result (1) is then passed back to sumOfNumbers(2), which calculates 2 *
// 1 = 2.
// This result (2) is then passed back to sumOfNumbers(3), which calculates 3 *
// 2 = 6.
// This result (6) is then passed back to sumOfNumbers(4), which calculates 4 *
// 6 = 24.
// Finally, this result (24) is passed back to sumOfNumbers(5), which calculates
// 5 * 24 = 120.
// Key Insight
// The base case (n == 0) ensures that the recursion stops and starts the
// unwinding process. Each recursive call multiplies the current value of n by
// the result of the next recursive call (n - 1), building up the final result
// as the calls return.
