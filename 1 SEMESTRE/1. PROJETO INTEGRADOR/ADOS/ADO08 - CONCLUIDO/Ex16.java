import java.util.Scanner;

public class Ex16 {

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
    for (double nota : notas) {
        soma += nota;
    }

    double media = soma / quantidade;

    System.out.println("\\nA média é " + media);

ler.close();

}
}