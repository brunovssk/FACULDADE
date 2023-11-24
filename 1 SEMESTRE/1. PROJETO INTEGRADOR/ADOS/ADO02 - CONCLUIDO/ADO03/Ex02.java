import java.util.Scanner;

public class Ex02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota 1 do aluno:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2 do aluno:");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3 do aluno:");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);

        if (media >= 6.0) {
            System.out.println("O aluno está aprovado!");
        } else {
            System.out.println("O aluno não está aprovado. Média insuficiente.");
        }

        scanner.close();
    }

    private static double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }
}
