public class Car {
    private String model;
    private String brand;
    private int year;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;

    }

    public String displayInfo() {
        return "Автомобиль: " + model + "\nМарка: " + brand + "\nГод выпуска: " + year;
    }

    public void setYear(int year) {
        if (year > 1885) { // Первый автомобиль был создан в 1885
            this.year = year;
        } else {
            System.out.println("Введите корректный год выпуска.");
        }
    }
}