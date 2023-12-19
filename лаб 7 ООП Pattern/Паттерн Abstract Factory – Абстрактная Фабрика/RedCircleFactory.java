// Конкретная фабрика для создания кругов и красного цвета
class RedCircleFactory implements AbstractFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }

    @Override
    public Color createColor() {
        return new Red();
    }
}