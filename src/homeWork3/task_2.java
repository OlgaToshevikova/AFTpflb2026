package homeWork3;

import java.util.Scanner;

public class task_2 {
    /*
       Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:

    Задача 2:
    Найти минимальный - максимальный элементы и вывести в консоль.
     */
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int mas[] = new int[a];
            System.out.println("Введите элементы массива по одному");  //Заполняем массив через ввод
            for (int i = 0; i < mas.length; i++) {
                mas[i] = scanner.nextInt();
        }
        int max = mas[0];                                                //Вычисляем максимальный элемент
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        System.out.println("Максимальное значение в массиве равно " + max);
        int min = mas[0];                                               //Вычисляем минимальный элемент
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < min) {
                min = mas[i];
            }
        }
        System.out.println("Минимальное значение в массиве равно " + min);
    }
}
