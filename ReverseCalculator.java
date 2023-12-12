 public class ReverseCalculator {
    public static int reverseWithWhile(int number) {
        int reversedNumber = 0;
        while (number > 0) {
            int remainder = number % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            number = number / 10;
        }
        return reversedNumber;
    }

    public static int reverseWithFor(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10;
        }
        return reversedNumber;
    }

    public static int reverseWithDoWhile(int number) {
        int reversedNumber = 0;
        do {
            int digit = number % 10;
            reversedNumber = (reversedNumber * 10) + digit;
            number /= 10;
        } while (number != 0);
        return reversedNumber;
    }

    public static void main(String[] args) {
        int number = 12345;
        System.out.println("original string is: "+number);
        // Using while loop
        int reversedWhile = reverseWithWhile(number);
        System.out.println("Reversed using while loop: " + reversedWhile);

        // Using for loop
        int reversedFor = reverseWithFor(number);
        System.out.println("Reversed using for loop: " + reversedFor);

        // Using do-while loop
        int reversedDoWhile = reverseWithDoWhile(number);
        System.out.println("Reversed using do-while loop: " + reversedDoWhile);
    }
} 
