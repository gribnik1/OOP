
public class Skirt extends Clothing implements WomensClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину в юбку");
    }
}