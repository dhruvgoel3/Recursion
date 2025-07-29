package Recursion_2;

import java.util.Scanner;

public class count_digits {
    public static int countDigits(int n)
    {
        if(n==0)
        return 0;
        return 1 + countDigits(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countDigits(n));
    }
    
}
