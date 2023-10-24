
public class Tie extends Clothing implements MensClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Одеваем мужчину в галстук");
    }
}