// Finf n factorial using recursion
package Recursion_1;

import java.util.Scanner;

public class factorial_1 {
    public static int findFactorial(int n) {
        if (n == 0)
            return 1;

        // int smallAns = findFactorial(n - 1);
        // int ans = n * smallAns;
        // return ans;
        // -------------------------------------------OR

        return n * findFactorial(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        System.out.println(findFactorial(n));
    }

}
