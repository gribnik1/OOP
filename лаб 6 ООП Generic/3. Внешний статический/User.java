public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        Query query = new Query(login, password);
        query.printToLog();
    }

    public static class Query {
        private String login;
        private String password;

        public Query(String login, String password) {
            this.login = login;
            this.password = password;
        }

        public void printToLog() {
            System.out.println("Пользователь с логином: " + login + " и паролем: " + password + " отправил запрос.");
        }
    }
}