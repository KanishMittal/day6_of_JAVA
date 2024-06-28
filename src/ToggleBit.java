//Write a program to toggle a bit a position = “pos” in a number “n”.
public class ToggleBit {
    public static int toggleBit(int n, int pos){
        return n ^ (1<<pos);
    }

    public static void main(String[] args) {
        int n = 29;
        int pos = 3;

        System.out.println("Orignal Number: "+n+", Binary: "+ Integer.toBinaryString(n));

        // Toggle the bit at the specified position
        int toggledNumber = toggleBit(n, pos);

        System.out.println("Number after toggling bit at the position "+pos+": "+toggledNumber+", Binary: "+Integer.toBinaryString(toggledNumber));
    }
}
