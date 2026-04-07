package homeWork7;
/*
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        String text3 = scanner.nextLine();
        String allText = text1.concat(" ").concat(text2).concat(" ").concat(text3);
        String words[] = allText.split(" ");
        System.out.println(Arrays.toString(words).concat(" Полученный массив слов"));
        for (String word : words) {
            char[] chars = word.toCharArray();
            boolean isUnique = true;
            for (int i = 0; i < chars.length; i++) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        isUnique = false;
                        break;
                    }
                }
            }
            if (!isUnique)
                break;
            if (isUnique) {
                System.out.println(word.concat("  Слово, состоящее из различных символов"));
                return;
            }
        }
        System.out.println("Нет слов, где бы символы не повторялись");
    }
}
