
// Реализация второй конкретной реализации
class BlueCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Рисуем круг[ цвет: голубой, радиус: " + radius + ", x: " + x + ", y: " + y + "]");
    }
}