    public class Main {
        public static void main(String[] args) {
            User user = new User("mylogin", "mypassword");
            user.createQuery();

            User.Query query1 = user.new Query();
            query1.printToLog();

            User.Query query2 = new User("anotherlogin", "anotherpassword").new Query();
            query2.printToLog();
        }
    }