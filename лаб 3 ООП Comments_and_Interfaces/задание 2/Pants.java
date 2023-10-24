
public class Pants extends Clothing implements MensClothing, WomensClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Одеваем мужчину в брюки");
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину в брюки");
    }
}
