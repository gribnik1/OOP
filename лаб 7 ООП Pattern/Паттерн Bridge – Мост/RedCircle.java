// Реализация конкретной реализации
class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Рисуем круг[ цвет: красный, радиус: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}