package homeWork5.forms;

public class Circle extends Form {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public double getPerimeter() {
        return (int) Math.PI * 2 * radius;
    }
}
