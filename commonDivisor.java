// Common divisor of a number
import java.util.Scanner;

class CommonDivisor {
    public static void main(String []ar) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number 1: ");
        int number1 = sc.nextInt();
        System.out.println("Enter a Number 2: ");
        int number2 = sc.nextInt();

        int commonDivisor = 0;

        for (int i = (number1 <= number2 ? number2 : number1); i > 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                commonDivisor = i;
                break;
            }
        }

        System.out.println("Greatest Common Divisor is " + commonDivisor);
    }
}
