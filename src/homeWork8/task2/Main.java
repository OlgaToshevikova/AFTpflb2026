package homeWork8.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal animalCollection = new Animal();
        animalCollection.removeAnimal("Кот");
        animalCollection.addAnimal("Кот");
        animalCollection.addAnimal("Пес");
        animalCollection.addAnimal("Белка");
        animalCollection.removeAnimal("Кот");
    }
}
