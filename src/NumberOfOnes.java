//Write a program to count the number of 1’s in a binary representation
//of the number

public class NumberOfOnes {
    public static int countOnes(int n){
        int count = 0;
        while (n != 0){
            count+= n&1; // Add the least significant bit to the count
            n>>=1;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 29;
        System.out.println("Number: "+n+", Binary: "+ Integer.toBinaryString(n));
        System.out.println("Number of 1's: "+ countOnes(n));
    }
}
