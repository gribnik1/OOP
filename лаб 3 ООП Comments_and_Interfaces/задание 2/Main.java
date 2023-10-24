public class Main {
    public static void main(String[] args) {
        Clothing[] clothingArray = new Clothing[4];
        clothingArray[0] = new TShirt(ClothingSize.M, 29.99, "Blue");
        clothingArray[1] = new Pants(ClothingSize.L, 49.99, "Black");
        clothingArray[2] = new Skirt(ClothingSize.S, 39.99, "Red");
        clothingArray[3] = new Tie(ClothingSize.M, 19.99, "Yellow");

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothingArray);
        atelier.dressMen(clothingArray);
    }
}