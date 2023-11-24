import java.util.Scanner;

public class Ex07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a altura do triângulo:");
        double altura = scanner.nextDouble();

        System.out.println("Digite a base do triângulo:");
        double base = scanner.nextDouble();

        double area = calcularAreaTriangulo(altura, base);

        System.out.println("A área do triângulo é: " + area);

        scanner.close();
    }

    private static double calcularAreaTriangulo(double altura, double base) {
        return (altura * base) / 2;
    }
}
