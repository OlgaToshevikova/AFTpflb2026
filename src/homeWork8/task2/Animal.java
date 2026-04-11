package homeWork8.task2;
/*
Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца.
Показать работу объекта этого класса в main методе другого
класса.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Animal {
    LinkedList<String> animals = new LinkedList<>();

    public void addAnimal(String animal) {
        animals.addFirst(animal);
        System.out.println(animals);
    }

    public void removeAnimal(String animal) {
        if (!animals.isEmpty()) {
            animals.removeLast();
        } else {
            System.out.println("Список пуст, удалять нечего");
        }
        System.out.println(animals);
    }
}
