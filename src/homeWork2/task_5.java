package homeWork2;

import java.util.Scanner;

public class task_5 {
/*
Задача *:
Напишите программу, где пользователь вводит любое целое положительное
число. А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы пользователь не мог ввести
некорректные данные
 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a;
    while (true) { //Осознанно берем бесконечный цикл, который сами прерываем break
        System.out.println("ВВедите положительное целое число");
        //Проверяем введенное значение
        if (scanner.hasNextInt()) { //Проеряем, что число целое
            a = scanner.nextInt();
            if (a > 0) { //Проверяем, что число пожительное
                break;
            } else {
                System.out.println("Введите положительное число");
            }
        } else {
            System.out.println("Введите целое число");
            scanner.next(); //Даем возможность ввести число заново
        }
    }
    int sum = 0; //Переменная для накопления
    for (int i = 1; i <= a; i++) {
        sum = sum + i;
    }
    System.out.println("Сумма от 1 до " + a + " равна " + " " + sum);
}
}




