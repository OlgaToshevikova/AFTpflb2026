package homeWork6;
/*
Задача 1:
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */

import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------/*1. try- catch*/-----------------------");
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            scanner.nextInt();
        } catch (Exception e) {
            System.out.println("На ноль делить нельзя!");
        }
        System.out.println("Продолжаем выполнение программы");
        System.out.println("----------------------*2. try-catch, где catch будет несколько*/--------");
        try {
            int[] nums = {7, 2, 8, 9};
            System.out.println(nums[10]);
            System.out.println("Вот это не должно распечататься");
        } catch (ArithmeticException e) {
            System.out.println("Произошла арифметическая ошибка");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("В массиве нет запрашиваемого индекса  ");
        }
        System.out.println("-------------------------/*3. try -catch, с использованием multi - catch*/---------------");
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Обработали ошибку и идем дальше");
        }
        System.out.println("--------------------------------/*4. try-catch-finally*/---------------------------------");
        try {
            int[] nums = {7, 2, 8, 9};
            System.out.println(nums[10]);
            System.out.println("Вот это не должно распечататься");
        } catch (ArithmeticException e) {
            System.out.println("Произошла арифметическая ошибка");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("В массиве нет запрашиваемого индекса  ");
        } finally {
            System.out.println("Есть блок finally и выводим это сообщение в любом случае");
        }
    }
}
