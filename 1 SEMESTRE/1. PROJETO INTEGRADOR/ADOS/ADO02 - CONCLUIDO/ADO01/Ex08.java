import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o lado do octógono:");
        double lado = scanner.nextDouble();

        double perimetro = calcularPerimetroOctogono(lado);

        System.out.println("O perímetro do octógono é: " + perimetro);

        scanner.close();
    }

    private static double calcularPerimetroOctogono(double lado) {
        return 8 * lado;
    }
}
