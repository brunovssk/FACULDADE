import java.util.Scanner;

public class Ex17 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantidade de notas: ");
    int quantidade = scanner.nextInt();

    double[] notas = new double[quantidade];

    for (int i = 0; i < quantidade; i++) {
        System.out.print("Informe a nota na posição " + i + ": ");
        notas[i] = scanner.nextDouble();
    }

    System.out.println("Notas digitadas:");
    for (double nota : notas) {
        System.out.print(nota + " - ");
    }

    double maiorNota = notas[0];
    for (int i = 1; i < quantidade; i++) {
        if (notas[i] > maiorNota) {
            maiorNota = notas[i];
        }
    }

    System.out.println("\\nA maior nota é " + maiorNota);

scanner.close();

}
}