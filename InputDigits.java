import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDigits {

    static String isPrimeNumber(int digit){
        if (digit > 0) {

            boolean isPrimeNumber = true;

            if (digit == 1) {
                isPrimeNumber = false;
            } else if (digit == 2 | digit == 3) {
                isPrimeNumber = true;
            } else {
                for (int i = 2; i <= digit / 2; i++) {
                    if (digit % i == 0) {
                        isPrimeNumber = false;
                        break;
                    }
                }
            }
            if (isPrimeNumber) {
                return "Digit is prime";
            } else {
                return "Digit is not prime";
            }
        } else {
            return "Input error - please enter integer more than zero, for exit enter finish";
        }
    }



    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter digits, for exit enter finish");

        while (true) {
            try {
                if (input.hasNextInt()) {
                    int digit = input.nextInt();
                    System.out.println(isPrimeNumber(digit));
                } else {
                    String digit = input.next();
                    if (digit.equals("finish")) {
                        break;
                    }
                    else {
                        System.out.println("Input error - please enter the digit, for exit enter finish");
                    }
                }
            }  catch (InputMismatchException exc) {
                System.out.println("Input error - please enter the digit, for exit enter finish");
            }
        }
    }
}
