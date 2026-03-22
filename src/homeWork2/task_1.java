package homeWork2;
import java.util.Scanner;

public class task_1 {
    /*
    Задача 1:
    Напишите программу, которая будет принимать на вход число из консоли и на
    выход будет выводить сообщение четное число или нет. Для определения
    четности числа используйте операцию получения остатка от деления (операция
    выглядит так: '% 2').
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Введенное число является четным");
        } else {
            System.out.println("Введенное число является нечетным");
        }
    }
}
