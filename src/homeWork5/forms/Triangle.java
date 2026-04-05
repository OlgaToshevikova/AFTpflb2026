package homeWork5.forms;

public class Triangle extends Form {
    int sideA;
    int sideB;

    public Triangle(int sideA, int sideB, int sideC, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    int sideC;
    int height;

    @Override
    public double getArea() {
        return sideA * height / 2.0;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
}
