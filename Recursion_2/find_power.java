package Recursion_2;

import java.util.Scanner;

public class find_power {
    public static int findPower(int p , int q)
    {
        if(q==0)
        {
            return 1;
        }
        return findPower(p, q-1) *p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of p :-");
        int p = sc.nextInt();
        System.out.print("Enter the value of q :-");
        int q = sc.nextInt();
        System.out.println(findPower(p, q));

        
    }
    
}
