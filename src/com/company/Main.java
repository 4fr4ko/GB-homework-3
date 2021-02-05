package com.company;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
   System.out.println("Ваша задача угадать число с трех попыток");
   int range = 9;
   int random = (int) (Math.random() * range);
    DoTask1(random, range);
        scanner.close();
    }
    private static void DoTask1(int random, int range) {
        System.out.println("Угадайте число от 0 до " + range);
        for (int i = 0; i < 3; i++) {
                System.out.println("Попытка " + (i + 1) + ":");
                int input_number = scanner.nextInt();
                if (input_number == random) {
                    System.out.println("Вы угадали");
                    break;
                } else if (input_number > random) {
                    System.out.println("Загаданное число меньше");
                } else {
                    System.out.println("Загаданное число больше");
                }
        }
        System.out.println("Вы хотите повторить игру? 1-да, 0-нет");
        if (scanner.nextInt() == 1) {
                DoTask1(random, range);
            } else {
            System.out.println("Спасибо за игру");
            }
    }
}

