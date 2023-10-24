public class TShirt extends Clothing implements MensClothing, WomensClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMen() {
        System.out.println("Одеваем мужчину в футболку");
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину в футболку");
    }
}

