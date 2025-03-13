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
    public boolean isAvailable() {
        return isAvailable; // Проверяет доступность книги
    }
    public void reserveBook() {
        if (isAvailable) {
            isAvailable = false; // Резервирует книгу
            System.out.println("Книга \"" + title + "\" зарезервирована.");
        } else {
            System.out.println("Книга \"" + title + "\" уже зарезервирована.");
        }
    }
}