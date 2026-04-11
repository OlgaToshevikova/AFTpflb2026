package homeWork8;
/*
Задача 3:
На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз. Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
 */

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        String[] strings = new String[]{"z", "f", "a", "f", "z", "f", "u"};
        Map<String, Boolean> map = new HashMap<>();
        for (int i = 0; i <= strings.length - 1; i++) {
            boolean isDouble = false;
            for (int j = 0; j < strings.length; j++) {
                if (i != j && strings[i].equals(strings[j])) {
                    isDouble = true;
                    break;
                }
            }
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], isDouble);
            }
        }
        System.out.println(map);
    }
}
