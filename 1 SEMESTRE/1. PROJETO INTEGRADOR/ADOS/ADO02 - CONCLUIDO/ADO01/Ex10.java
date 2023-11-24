import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaNotas = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite a nota " + i + ":");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = calcularMedia(somaNotas, 5);

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }

    private static double calcularMedia(double soma, int quantidade) {
        return soma / quantidade;
    }
}
