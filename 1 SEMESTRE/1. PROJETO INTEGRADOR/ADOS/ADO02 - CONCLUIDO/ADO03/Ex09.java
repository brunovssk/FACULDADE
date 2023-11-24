import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a capacidade do tanque em litros: ");
        double capacidadeTanque = scanner.nextDouble();

        System.out.print("Digite a quantidade atual de combustível em litros: ");
        double quantidadeCombustivel = scanner.nextDouble();

        if (deveReabastecer(capacidadeTanque, quantidadeCombustivel)) {
            System.out.println("É sugerido reabastecer o carro.");
        } else {
            System.out.println("Não é necessário reabastecer o carro neste momento.");
        }

        scanner.close();
    }

    public static boolean deveReabastecer(double capacidadeTanque, double quantidadeCombustivel) {
        return quantidadeCombustivel <= capacidadeTanque / 4;
    }
}
