// Ques = Print all th natural numbers from 1 to n using recursion
package Recursion_intro;

import java.util.Scanner;

public class ques_1 {
    public static void printIncreasing(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);

    }  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }

}
