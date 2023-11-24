import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double triplo = numero * 3;

        System.out.println("O triplo de " + numero + " é: " + triplo);

        scanner.close();
    }
}
