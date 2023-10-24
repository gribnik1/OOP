public class Atelier {
    public void dressWomen(Clothing[] clothingArray) {
        System.out.println("Одежда для женщин:");
        for (Clothing clothing : clothingArray) {
            if (clothing instanceof WomensClothing) {
                System.out.println("Размер: " + clothing.size);
                System.out.println("Стоимость: " + clothing.cost);
                System.out.println("Цвет: " + clothing.color);
                ((WomensClothing) clothing).dressWomen();
                System.out.println();
            }
        }
    }

    public void dressMen(Clothing[] clothingArray) {
        System.out.println("Одежда для мужчин:");
        for (Clothing clothing : clothingArray) {
            if (clothing instanceof MensClothing) {
                System.out.println("Размер: " + clothing.size);
                System.out.println("Стоимость: " + clothing.cost);
                System.out.println("Цвет: " + clothing.color);
                ((MensClothing) clothing).dressMen();
                System.out.println();
            }
        }
    }
}