public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; // Книга доступна по умолчанию

    }
    public String getBookInfo() {
        return "Название: " + title + ", Автор: " + author + ", Доступность: " + (isAvailable ? "Доступна" : "Недоступна");
    }

}