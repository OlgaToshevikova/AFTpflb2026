package homeWork1;

public class task_3 {
    public static void main(String[] args) {
        int n = 126;
        int first = n / 100; // Получаем первое число (делим без остатка на 100)
        int second = (n % 100) / 10; //Получаем второе число
        int third = (n % 100) % 10; //Получаем третье число
        int sum = first + second + third;
        System.out.println(sum);
    }
}
