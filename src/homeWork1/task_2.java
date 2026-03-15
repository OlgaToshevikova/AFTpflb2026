package homeWork1;

public class task_2 {
    public static void main(String[] args) {

        int n = 26;
        int first = n / 10;  //здесь получаем 2 (делим без отстатка)
        int second = n % 10; // здесь получаем 6 (делим с остатком)
        int sum = first + second;
        System.out.println(sum);

    }
}
