public class Main {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Иванов Иван Иванович", "123456", "Факультет информатики", "01.01.1990", "+7-123-456-78-90");
        Reader reader2 = new Reader("Петров Петр Петрович", "987654", "Факультет экономики", "05.05.1995", "+7-987-654-32-10");

        reader1.takeBook(3);
        reader1.takeBook("Приключения", "Словарь", "Энциклопедия");

        Book book1 = new Book("Приключения", "Автор1");
        Book book2 = new Book("Словарь", "Автор2");
        Book book3 = new Book("Энциклопедия", "Автор3");
        reader1.takeBook(book1, book2, book3);

        reader2.returnBook(2);
        reader2.returnBook("Книга1", "Книга2");

        Book book4 = new Book("Книга1", "Автор1");
        Book book5 = new Book("Книга2", "Автор2");
        reader2.returnBook(book4, book5);
    }
}