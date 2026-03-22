package homeWork2;

public class task_3 {
    /*
    Задача 3:
Составьте программу, выводящую на экран квадраты чисел от 10 до 20
включительно.
     */
    public static void main(String[] args) {

        for (int i = 10; i <= 20; i++) {
            double a = Math.pow(i, 2);
            System.out.println(a + " Квадрат от " + i);
        }
    }
}
