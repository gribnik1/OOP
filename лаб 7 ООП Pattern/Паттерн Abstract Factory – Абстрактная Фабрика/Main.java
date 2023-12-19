// Клиентский код
public class Main {
    public static void main(String[] args) {
        // Создаем фабрику для кругов и красного цвета
        AbstractFactory redCircleFactory = new RedCircleFactory();
        Shape redCircle = redCircleFactory.createShape();
        Color redColor = redCircleFactory.createColor();

        // Создаем фабрику для треугольников и синего цвета
        AbstractFactory blueTriangleFactory = new BlueTriangleFactory();
        Shape blueTriangle = blueTriangleFactory.createShape();
        Color blueColor = blueTriangleFactory.createColor();

        // Рисуем и заполняем цветами
        redCircle.draw();
        redColor.fill();

        blueTriangle.draw();
        blueColor.fill();
    }
}