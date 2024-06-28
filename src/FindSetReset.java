public class FindSetReset {
    public static void main(String[] args) {
        int n = 182; //10110110
        int pos = 4;  //5th bit
        int bitMask = 1 << pos;

        //Finding the 5th bit of number
        if ((n & bitMask)==0){
            System.out.println("Bit was zero");
        }
        else
            System.out.println("Bit was one");

        //Setting the 4th bit
        int setNumber = n | (1<<3);
        System.out.println(setNumber);

        //Reset the 5th bit
        System.out.println(~(bitMask) & n);
    }
}
