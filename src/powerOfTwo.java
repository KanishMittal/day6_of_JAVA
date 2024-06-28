//Write a program to find if a number is a power of 2 or not.

import java.util.*;

public class powerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        // A number n is a power of 2 if (n > 0) and (n & (n - 1)) == 0
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPowerOfTwo(num))
            System.out.println(num + " is a power of 2");
        else System.out.println(num + " is not a power of 2");
    }
}

