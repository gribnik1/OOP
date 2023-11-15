public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query();
        query.printToLog();
    }

    public class Query { // Изменил модификатор доступа на public
        public void printToLog() {
            System.out.println("Пользователь с логином: " + login + " и паролем: " + password + " отправил запрос.");
        }
    }
}