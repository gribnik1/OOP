public abstract class Clothing {
    protected ClothingSize size;
    protected double cost;
    protected String color;

    public Clothing(ClothingSize size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    // Дополнительные методы, геттеры и сеттеры
}