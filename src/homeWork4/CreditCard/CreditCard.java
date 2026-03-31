package homeWork4.CreditCard;

public class CreditCard {
    /*
    Задача 1:
Создать класс CreditCard c полями номер счета, текущая сумма на счету.
Добавьте метод, который позволяет начислять сумму на кредитную карточку.
Добавьте метод, который позволяет снимать с карточки некоторую сумму.
Добавьте метод, который выводит текущую информацию о карточке. Напишите
программу, которая создает три объекта класса CreditCard у которых заданы
номер счета и начальная сумма.
Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
     */

    int countNumber;
    int currentCountSum;

    public CreditCard(int countNumber, int currentCountSum) {//Конструктор
        this.countNumber = countNumber;
        this.currentCountSum = currentCountSum;
    }
    public int addMany(int sum) {                            //Добавляем сумму на счет
        currentCountSum = currentCountSum + sum;
        System.out.println("Операция успешна.Добавлена сумма " + sum + " Ваш баланс равен " + currentCountSum);
        return currentCountSum;
    }
    public int withdrawMoney(int sum1) {                       //Снимаем сумму со счета
        if (currentCountSum >= sum1) {
            currentCountSum = currentCountSum - sum1;
            System.out.println("Операция успешна, ваш баланс " + currentCountSum);
        } else {
            System.out.println("Не достаточно средств на счете");
        }
        return currentCountSum;
    }
    public void currentStateCount() {                            //Выводим информацию о карте
        System.out.println("Номер счета " + countNumber);
        System.out.println("Ваш баланс " + currentCountSum);
    }
}
