package homeWork4.Bankomat;

public class Main {
    public static void main(String[] args) {
        Bankomat bankomat=new Bankomat(0,0,0);

        bankomat.addMoney(20,2,1);
        bankomat.withdrawMoney(200);
    }
}
