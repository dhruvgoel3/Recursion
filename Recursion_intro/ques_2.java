// Print all the natural numbers from  n to 1 
package Recursion_intro;

import java.util.Scanner;

public class ques_2 {
    public static void printDecreasing(int n)
    {
        if(n == 1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
        
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
        
    }
    
}
