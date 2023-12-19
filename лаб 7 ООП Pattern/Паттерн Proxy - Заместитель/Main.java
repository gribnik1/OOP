// Пример использования
public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("photo_2023-11-15_06-53-36.jpg");

        // Реальный объект будет загружен только при вызове метода display()
        image.display();

        // Загрузка повторно не выполняется, так как реальный объект уже создан
        image.display();
    }
}