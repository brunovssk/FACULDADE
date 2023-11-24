import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo:");
        double altura = scanner.nextDouble();

        System.out.println("Digite a base do retângulo:");
        double base = scanner.nextDouble();

        double area = calcularAreaRetangulo(altura, base);

        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }

    private static double calcularAreaRetangulo(double altura, double base) {
        return altura * base;
    }
}
