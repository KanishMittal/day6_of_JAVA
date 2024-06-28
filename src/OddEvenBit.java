import java.util.*;

public class OddEvenBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if ((n&1) == 1)
            System.out.println(n+ " is odd");
        else
            System.out.println(n+" is even");
    }
}
