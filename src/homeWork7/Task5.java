package homeWork7;
/*
Задача 5:
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
 */

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        StringBuilder result = new StringBuilder();
        char chars[] = text.toCharArray();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result.append(c).append(c);
        }
        System.out.println(result);
    }
}
