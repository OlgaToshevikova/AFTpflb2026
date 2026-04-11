package homeWork8.task2;

public class Main {
    public static void main(String[] args) {
        AnimalsSet animalCollection = new AnimalsSet();
        animalCollection.removeAnimal("Кот");
        animalCollection.addAnimal("Кот");
        animalCollection.addAnimal("Пес");
        animalCollection.addAnimal("Белка");
        animalCollection.removeAnimal("Кот");
    }
}
