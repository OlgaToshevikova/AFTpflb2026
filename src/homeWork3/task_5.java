package homeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_5 {
    /*
     Для всех задач исходные условия следующие: пользователь с клавиатуры
    вводит размер массива (просто целое число). После того, как размер массива
    задан, заполнить его одним из двух способов: используя Math.random(), или
    каждый элемент массива вводится пользователем вручную. Попробовать оба
    варианта. После заполнения массива данными, решить для него следующие
    задачи:
    Задача 5:
Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int mas[] = new int[a];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(11);
        }
        System.out.println(Arrays.toString(mas));
        for (int i = 0; i < mas.length / 2; i++) {
            int temp = mas[i];
            mas[i] = mas[mas.length - 1 - i];
            mas[mas.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(mas));
    }
}
