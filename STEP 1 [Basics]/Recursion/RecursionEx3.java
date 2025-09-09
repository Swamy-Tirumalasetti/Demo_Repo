public class RecursionEx3 {
    public static void print(int i, int n) {
        if (i < 1)
            return;
        System.out.println(i);
        print(i - 1, n);
    }

    public static void printSameOutput(int i, int n) {
        if (i > n)
            return;
        printSameOutput(i + 1, n);
        System.out.println(i);

    }

    public static void main(String[] args) {
        print(4, 4);
        printSameOutput(1, 4);
    }
}

// ** NOTE **//

// Initial Call: print1To4BackTrace(4, 4)

// i is 4, which is not less than 1, so it proceeds to the recursive call.
// Calls print1To4BackTrace(3, 4)
// Second Call: print1To4BackTrace(3, 4)

// i is 3, which is not less than 1, so it proceeds to the recursive call.
// Calls print1To4BackTrace(2, 4)
// Third Call: print1To4BackTrace(2, 4)

// i is 2, which is not less than 1, so it proceeds to the recursive call.
// Calls print1To4BackTrace(1, 4)
// Fourth Call: print1To4BackTrace(1, 4)

// i is 1, which is not less than 1, so it proceeds to the recursive call.
// Calls print1To4BackTrace(0, 4)
// Base Case: print1To4BackTrace(0, 4)

// i is 0, which is less than 1, so it hits the base case and returns without
// printing anything.
// Now, let's trace back through the recursive calls:

// Returning to Fourth Call: print1To4BackTrace(1, 4)

// After returning from the base case, it prints 1.
// Returning to Third Call: print1To4BackTrace(2, 4)

// After returning from the fourth call, it prints 2.
// Returning to Second Call: print1To4BackTrace(3, 4)

// After returning from the third call, it prints 3.
// Returning to Initial Call: print1To4BackTrace(4, 4)

// After returning from the second call, it prints 4.
// Summary of Execution Flow:
// The recursive calls are made first, decrementing i each time until i is less
// than 1.
// Once the base case is reached, the recursion starts to unwind.
// During the unwinding phase, the print statements are executed in reverse
// order of the calls.