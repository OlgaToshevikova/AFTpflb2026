package homeWork7;
/*
Задача 3:
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
 */

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String[] strings = {string1, string2, string3};
        int length1 = string1.length();
        int length2 = string1.length();
        int length3 = string1.length();
        int averageLength = (length1 + length2 + length3) / 3;
        int count = 0;

        System.out.println(String.valueOf(averageLength).concat(" средняя длина"));
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < averageLength) {
                count++;
            }
        }
        String newStrings[] = new String[count];
        int index = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < averageLength) {
                newStrings[index] = strings[i];
                index++;
            }
        }
        for (String s : newStrings) {
            System.out.println(s.concat(" это строка и длина равна ").concat(String.valueOf(s.length())));
        }

    }
}
