import java.util.Scanner;

public class Ex19 {

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Quantidade de notas: ");
    int quantidade = ler.nextInt();

    double[] notas = new double[quantidade];

    for (int i = 0; i < quantidade; i++) {
        System.out.print("Informe a nota na posição " + i + ": ");
        notas[i] = ler.nextDouble();
    }

    System.out.println("Notas digitadas:");
    for (double nota : notas) {
        System.out.print(nota + " - ");
    }

    double soma = 0.0;
    double maiorNota = notas[0];
    double menorNota = notas[0];
    for (double nota : notas) {
        soma += nota;
        if (nota > maiorNota) {
            maiorNota = nota;
        }
        if (nota < menorNota) {
            menorNota = nota;
        }
    }

    double media = soma / quantidade;

    System.out.println("\\nA média é " + media);
    System.out.println("A maior nota é " + maiorNota);
    System.out.println("A menor nota é " + menorNota);

ler.close();

}
}