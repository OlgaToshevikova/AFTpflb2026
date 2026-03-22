package homeWork2;

import java.util.Scanner;

public class task_2 {
    /*
    Задача 2:
Для введенного числа t (температура на улице) вывести:
Если t>–5, то вывести «Warm».
Если –5>= t >–20, то вывести «Normal».
 Если –20>= t, то вывести «Cold».
     */
    public static void main(String[] args) {
        System.out.println("Введидите значение температуры");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        if (t > -5) {
            System.out.println("Warm");
        } else if (t > -20) {
            {
                System.out.println("Normal");
            }
        } else {
            System.out.println("Cold");
        }
    }
}

