import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a primeira nota: ");
        double nota1 = ler.nextDouble();

        System.out.println("Informe a segunda nota: ");
        double nota2 = ler.nextDouble();

        System.out.println("Informe a terceira nota: ");
        double nota3 = ler.nextDouble();

        System.out.println("Informe a quantidade de faltas: ");
        int faltas = ler.nextInt();

        double media = (nota1 + nota2 + nota3) / 3.0;

        if (faltas > 30) {
            System.out.println("Reprovado por faltas (mais de 30 faltas).");
        } else if (media >= 8.0) {
            System.out.println("Aprovado com Sucesso.");
        } else if (media >= 6.0 && media < 8.0) {
            System.out.println("Voce foi Aprovado.");
        } else if (media >= 3.0 && media < 6.0) {
            System.out.println("Recuperação.");
        } else if (media < 3.0 && media >= 0) {
            System.out.println("Reprovado.");
        } else {
            System.out.println("Desistente.");
        }

        ler.close();
    }
}
