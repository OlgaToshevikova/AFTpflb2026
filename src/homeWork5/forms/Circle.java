package homeWork5.forms;

public class Circle extends Form {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int getPerimeter() {
        return (int) Math.PI * 2 * radius;
    }
}
