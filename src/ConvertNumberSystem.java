//Write 2 functions => decimalToBinary() & binaryToDecimal() to convert a
//number from one number system to another
public class ConvertNumberSystem {
    public static String decimalToBinary(int n){
        if (n == 0)
            return "0";
        StringBuilder binary = new StringBuilder();
        while (n>0){
            binary.insert(0,n%2); // Append remainder to the front of the string
            n/=2;
        }
        return binary.toString();
    }

    public static int binaryToDecimal(String binary){
        int decimal = 0;
        int length = binary.length();
        for (int i = 0; i < length; i++) {
            if (binary.charAt(length - 1 - i) == '1'){
                decimal+= Math.pow(2,i);
            }
        }
        return decimal;
    }

    public static void main(String[] args) {
        //test decimal to binary
        int decimalNumber = 29;
        String binaryRepresentation = decimalToBinary(decimalNumber);
        System.out.println("Decimal: "+decimalNumber+ " -> Binary: "+binaryRepresentation);

        //test binary to decimal
        String binaryNumber = "11101";
        int decimalRepresentation = binaryToDecimal(binaryNumber);
        System.out.println("Binary: "+binaryNumber+" -> Decimal: "+decimalRepresentation);
    }
}
