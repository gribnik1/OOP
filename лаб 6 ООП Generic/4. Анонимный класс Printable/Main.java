public class Main {
    public static void main(String[] args) {
        Printable printable = new Printable() {
            @Override
            public void print() {
                System.out.println("Вызван метод print() из анонимного класса Printable.");
            }
        };

        printable.print();
    }
}