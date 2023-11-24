import java.util.Scanner;

public class Ex04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        double numero = scanner.nextDouble();

        double metade = calcularMetade(numero);

        System.out.println("A metade do número é: " + metade);

        scanner.close();
    }

    private static double calcularMetade(double numero) {
        return numero / 2;
    }
}
