public class Main {
    public static void main(String[] args) {
        /*
           В этом решение существуют лишние
           вызовы операционной системе
         */
        // System.out.println("**************");
        // System.out.println("*Привет, Мир!*");
        // System.out.println("**************");

        // Это решение сложно читать в исходном файле
        // System.out.println("**************\n*Привет, Мир!*\n**************");

        // Это решение использует операцию конкатенации
        System.out.println(
            "**************\n" +
            "*Привет, Мир!*\n" +
            "**************"
        );
    }
}