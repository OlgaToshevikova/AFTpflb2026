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
    public int getArea() {
        return (sideA / 2) * height;
    }

    @Override
    public int getPerimeter() {
        return sideA + sideB + sideC;
    }
}
