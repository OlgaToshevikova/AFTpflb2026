package homeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_6 {
    /*
      Для всех задач исходные условия следующие: пользователь с клавиатуры
    вводит размер массива (просто целое число). После того, как размер массива
    задан, заполнить его одним из двух способов: используя Math.random(), или
    каждый элемент массива вводится пользователем вручную. Попробовать оба
    варианта. После заполнения массива данными, решить для него следующие
    задачи:
    Задача 6:
Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).
     */
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int mas[] = new int[size];
        System.out.println("Введите элементы массива по одному");  //Заполняем массив через ввод
        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(mas));
        boolean inc = true;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] <= mas[i - 1]) {
                inc = false;
                break;
            }
        }
        if (inc) {
            System.out.println("Массив возрастающий");
        } else {
            System.out.println("Массив не возрастающий");
        }
    }
}
