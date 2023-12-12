 public class FunCalculator {
    
    public static boolean isArmstrong(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += (digit * digit * digit);
            temp /= 10;
        }
        return sum == number;
    }

    public static boolean isLucky(int number) {
        String numStr = String.valueOf(number);
        int sum = 0;

        for (int i = 1; i < numStr.length(); i += 2) {
            int digit = numStr.charAt(i) - '0';
            sum += (digit * digit);
        }

        return sum % 9 == 0;
    }

    public static void main(String[] args) {
        int armstrongNum = 153;
        System.out.println(+armstrongNum);
        int luckyNum = 1623;
        System.out.println(+luckyNum);

        System.out.println(armstrongNum + " is Armstrong: " + isArmstrong(armstrongNum));
        System.out.println(luckyNum + " is Lucky: " + isLucky(luckyNum));
    }
} 
