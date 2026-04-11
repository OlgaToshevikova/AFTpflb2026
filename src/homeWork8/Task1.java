package homeWork8;
/*
Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел  в одну строку через пробел или запятую+пробел");
        String input = scanner.nextLine();
        String[] tempMas = input.split("[,\\s*]+");
        Set<String> set = new LinkedHashSet<>();
        for (int i = 0; i < tempMas.length; i++) {
            set.add(tempMas[i].trim());
        }
        System.out.println(set);
    }
}
