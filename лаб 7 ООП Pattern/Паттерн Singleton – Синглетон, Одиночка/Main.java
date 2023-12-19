public class Main {
    public static void main(String[] args) {
        // Получение экземпляра Singleton
        Singleton singleton = Singleton.getInstance();

        // Вызов метода экземпляра
        singleton.doSomething();
    }
}