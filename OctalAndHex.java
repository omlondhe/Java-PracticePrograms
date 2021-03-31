import java.util.Scanner;

class OctalAndHex {
    public static void main(String []ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number");
        int number = sc.nextInt();

        int octIn = number;
        String octal = "";
        while (octIn > 0) {
            octal += String.valueOf(octIn % 8);
            octIn /= 8; 
        }

        int hexIn = number;
        String hex = "";
        while (hexIn > 0) {
            hex += hexIn % 16 == 10 ? "A" : hexIn % 16 == 11 ? "B" : hexIn % 16 == 12 ? "C" : hexIn % 16 == 13 ? "D" : hexIn % 16 == 14 ? "E" : hexIn % 16 == 15 ? "F" : String.valueOf(hexIn % 16);
            hexIn /= 16; 
        }



        System.out.println("Octal Number: " + new StringBuffer(octal).reverse().toString());
        System.out.println("Hexadecimal Number: " + new StringBuffer(hex).reverse().toString());
    }
}
