import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite o valor do cupom de desconto: ");
        double valorCupom = scanner.nextDouble();

        double valorFinal = calcularValorFinal(valorCompra, valorCupom);

        System.out.println("O valor final da compra é: R$" + valorFinal);

        scanner.close();
    }

    private static double calcularValorFinal(double valorCompra, double valorCupom) {
        if (valorCupom > valorCompra) {
            System.out.println("O cupom de desconto não pode ser maior que o valor da compra.");
            return valorCompra;
        } else {
            return valorCompra - valorCupom;
        }
    }
}
