package homeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_4 {
    /*
      Для всех задач исходные условия следующие: пользователь с клавиатуры
    вводит размер массива (просто целое число). После того, как размер массива
    задан, заполнить его одним из двух способов: используя Math.random(), или
    каждый элемент массива вводится пользователем вручную. Попробовать оба
    варианта. После заполнения массива данными, решить для него следующие
    задачи:
    Задача 4:
    Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.
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
        int nullCount = 0;
        int pos = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] == 0) {
                nullCount = nullCount + 1;
                pos = i;
                System.out.println("Нулевой элемент с индексом " + pos);
                System.out.println("Количество нулевых элементов равно " + nullCount);
            }
        }
        if (pos == 0) {
            System.out.println("Нулевых элементов нет");
        }
    }
}
