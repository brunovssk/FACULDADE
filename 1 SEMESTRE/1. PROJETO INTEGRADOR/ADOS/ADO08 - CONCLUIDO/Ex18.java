import java.util.Scanner;

public class Ex18 {
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

    double menorNota = notas[0];
    for (int i = 1; i < quantidade; i++) {
        if (notas[i] < menorNota) {
            menorNota = notas[i];
        }
    }

    System.out.println("\\nA menor nota é " + menorNota);

ler.close();

}
}