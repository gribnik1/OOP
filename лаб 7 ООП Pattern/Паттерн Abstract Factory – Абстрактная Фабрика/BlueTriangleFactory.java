// Конкретная фабрика для создания треугольников и синего цвета
class BlueTriangleFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Triangle();
    }

    @Override
    public Color createColor() {
        return new Blue();
    }
}