import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c, volume;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение стороны a: ");
        a = scanner.nextShort();

        System.out.print("Введите значение стороны b: ");
        b = scanner.nextShort();

        System.out.print("Введите значение стороны c: ");
        c = scanner.nextShort();

        int x = 10;
        long y = x;

        volume = 10 + a*b*c; // вычитание          -
                             // деление            /
                             // остаток от деления %
        System.out.println((float) 10 / 3);
        System.out.printf(
            "Объем параллелепипеда (%d x %d x %d) равен %d\n",
            a, b, c, volume
        );
    }

}