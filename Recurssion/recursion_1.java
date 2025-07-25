// Ques Print numbers from 5 to 1 using recursion
// Ans -  Control 1stly go to main function where n=5,and then it comes to outer function and see that n is not equal to zero and decrement the value of n by 1. And 

public class recursion_1 {
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printNumbers(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        printNumbers(n);

    }

}
