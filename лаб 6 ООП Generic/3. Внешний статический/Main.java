public class Main {
    public static void main(String[] args) {
        User user = new User("мойлогин", "мойпароль");
        user.createQuery();

        User.Query query1 = new User.Query("другойлогин", "другойпароль");
        query1.printToLog();
    }
}