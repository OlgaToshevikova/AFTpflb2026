package homeWork1;

public class task6_try2 {
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c =a; //Присвоили значение a переменной с (сохранили исходное значерие а в премежуточной переменной (c=1))
        a=b; //Присвоили переменной a значение b (a=2)
        System.out.println("a = "+a);
        b=c; // присвоили переменной b исходное значение a
        System.out.println("b = "+b);

    }
}
