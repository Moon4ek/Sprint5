package Spint5;

public class Fibonacci {

	// Головна функція
    public static void main(String[] args) {
        // Виводимо заголовок таблиці
        System.out.println("Місяць\tПари");
        // Обчислюємо і виводимо числа Фібоначчі для перших 12 місяців
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + "\t" + fibonacci(i));
        }
    }
// Функція для обчислення числа Фібоначчі
    public static int fibonacci(int N) {
        double phi = (1 + Math.sqrt(5)) / 2;
        // Повертаємо наближене значення числа Фібоначчі
        return (int) Math.round(Math.pow(phi, N) / Math.sqrt(5));
    }
}