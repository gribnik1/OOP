public class Singleton {
    private static Singleton instance;

    // Приватный конструктор, чтобы предотвратить создание экземпляров класса извне
    private Singleton() {
    }

    // Метод для доступа к единственному экземпляру класса
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Дополнительные методы экземпляра класса
    public void doSomething() {
        System.out.println("Делаю что-то...");
    }
}