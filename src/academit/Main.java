package academit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальное значение : ");
        int min = scanner.nextInt();

        System.out.print("Введите конечное значение : ");
        int max = scanner.nextInt();

        int sumAll = 0;
        int sumEven = 0;
        int counter = 0;

        for (int i = min; i <= max; i++) {
            sumAll = sumAll + i;
            if (i % 2 == 0) {
                sumEven = sumEven + i;
                counter++;
            }

        }

        double average = (double) sumAll / (max - min + 1);
        double averageEven = (double) sumEven / counter;

        System.out.println("Среднее арифметическое четных чисел = " + averageEven);
        System.out.println("Среднее арифметическое = " + average);
    }


}
