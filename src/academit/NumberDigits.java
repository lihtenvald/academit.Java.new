package academit;

import java.util.Scanner;

public class NumberDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число:");

        int number = scanner.nextInt();

        int digitsSum = 0;
        int evenDigitsSum = 0;
        int maxDigit = 0;

        if (number < 0) {
            number = Math.abs(number);
        }
        while (number != 0) {
            int lastDigit = number % 10;
            digitsSum += lastDigit;

            if (lastDigit % 2 != 0) {
                evenDigitsSum += lastDigit;
            }
            if (lastDigit > maxDigit) {
                maxDigit = lastDigit;
            }
            number /= 10;
        }

        System.out.println("Сумма цифр целого числа: " + digitsSum);
        System.out.println("Сумма нечетных цифр целого числа: " + evenDigitsSum);
        System.out.println("Максимальная цифра целого числа: " + maxDigit);
    }
}