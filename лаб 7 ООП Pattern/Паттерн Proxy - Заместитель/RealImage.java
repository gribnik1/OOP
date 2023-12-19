// Реальный объект
class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Загрузка картинки: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Показ картинки: " + filename);
    }
}