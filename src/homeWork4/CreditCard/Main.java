package homeWork4.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard firstCard = new CreditCard(111111111, 100);
        CreditCard secondCard = new CreditCard(222222222, 200);
        CreditCard thirdCard = new CreditCard(33333333, 300);
        firstCard.addMany(500);
        firstCard.currentStateCount();
        System.out.println();
        secondCard.addMany(400);
        secondCard.currentStateCount();
        System.out.println();
        thirdCard.withdrawMoney(250);
        thirdCard.currentStateCount();
    }
}
