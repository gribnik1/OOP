package shapes;

import java.awt.Color;

public abstract class sh {
    private Color color = Color.white;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void move(double moveX, double moveY) {
        // Реализация перемещения фигуры на плоскости.
    }

    public void draw() {
        System.out.println("Фигура: " + getShapeName());
        System.out.println("Цвет: " + getColor());
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Координаты точек: " + getCoordinates());
    }

    protected abstract String getShapeName();

    protected abstract String getCoordinates();
}

