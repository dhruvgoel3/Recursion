package Recursion_2;

import java.util.Scanner;

public class sum_digits {
    public static int  sumOfDigits(int n)
    {
        if(n>=0 && n<=9)
        {
            return n;
        }
        // int smallAns = sumOfDigits(n/10);
        // return smallAns + n%10;
        // -------------------------------------------

        return sumOfDigits(n/10) + n%10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter the value of n");
        int n = sc.nextInt();
        System.out.println(sumOfDigits(n));
        
          
    }
    
}
