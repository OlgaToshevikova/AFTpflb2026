package homeWork5.forms;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 5);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(2, 3, 4, 3);
        System.out.println("Периметр прямоугольника равен " + rectangle.getPerimeter());
        System.out.println("Периметр круга равен " + circle.getPerimeter());
        System.out.println("Периметр треугольника равен " + triangle.getPerimeter());
        Form[] forms = new Form[]{rectangle, circle, triangle, circle, triangle};
        double sum = 0;
        for (int i = 0; i <= 4; i++) {
            sum = sum + forms[i].getPerimeter();
            System.out.println("Периметр " + forms[i] + " равен " + sum);
        }
        System.out.println("Сумма периметров " + sum);
    }
}
