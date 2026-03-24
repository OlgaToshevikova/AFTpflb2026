package homeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_3 {
    /*
    Для всех задач исходные условия следующие: пользователь с клавиатуры
    вводит размер массива (просто целое число). После того, как размер массива
    задан, заполнить его одним из двух способов: используя Math.random(), или
    каждый элемент массива вводится пользователем вручную. Попробовать оба
    варианта. После заполнения массива данными, решить для него следующие
    задачи:
    Задача 3:
   Найти индексы минимального и максимального элементов и вывести в консоль.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] mas = new int[size];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(mas));
        int max = mas[0];                                //Вычисляем максимальный элемент
        int posMax = 0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
                posMax = i;                             //Фиксируем индекс
            }
        }
        System.out.println("Максимальное значение элемента равно " + max + ", значение его индекса равно " + posMax);
        int min = mas[0];                               //Вычисляем минимальный элемент
        int posMin = 0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
                posMin = i;                             //Фиксируем индекс
            }
        }
        System.out.println("Минимальное  значение элемента равно " + min + ", значение его индекса равно " + posMin);
    }
}
