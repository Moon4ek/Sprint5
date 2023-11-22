package Spint5;

public class suputnik {

	/// Константи для гравітаційної сталої та маси Землі
    public static final double G = 6.67e-11;      // м^3/kg * s²
    public static final double EARTH_MASS = 5.98e24; // кг

    // Головний метод програми
    public static void main(String[] args) {
        // Приклад використання методу для обчислення швидкості супутника
        double distanceToSatellite = 500000; // відстань в метрах 
        double speed = satelliteSpeed(distanceToSatellite);

        // Виведення результату
        System.out.println("Швидкість супутника: " + speed + " м/с");
    }

    // Метод для обчислення швидкості супутника
    static double satelliteSpeed(double distanceToSatellite) {
        // Формула для обчислення швидкості супутника
        double speed = Math.sqrt((G * EARTH_MASS) / distanceToSatellite);
        return speed;
    }
}