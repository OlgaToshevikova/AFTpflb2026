package homeWork7;

import java.util.Scanner;
/*
Задача 1:
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
 */

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String[] strings = {string1, string2, string3};
        int min = string1.length();
        int max = string1.length();
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < strings.length; i++) {
            if (strings[i].length() < min) {
                min = strings[i].length();
                minIndex = i;
            }
            if (strings[i].length() > max) {
                max = strings[i].length();
                maxIndex = i;
                System.out.println(strings[minIndex].concat(" -это строка с минимальной длиной. ").concat("Ее длина равна ").concat(String.valueOf(min)));
                System.out.println(strings[maxIndex].concat(" -это строка с максимальной длиной. ").concat("Ее длина равна ").concat(String.valueOf(max)));
            }
        }
    }
}
