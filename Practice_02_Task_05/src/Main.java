import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Фаренгейта? ");
        double degreesFahrenheit = scanner.nextDouble();
        double degreesCelsius = (degreesFahrenheit - 32) * 5 / 9;

        System.out.printf(
            "Температура в градусах Цельсия: %.2f\n",
            degreesCelsius
        );
    }
}
