import java.util.Scanner;

public class Ex21 {

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Quantidade de alunos: ");
    int quantidade = ler.nextInt();

    double[] notas = new double[quantidade];

    for (int i = 0; i < quantidade; i++) {
        System.out.print("Informe a média final do aluno " + i + ": ");
        notas[i] = ler.nextDouble();
    }

    System.out.println("Notas digitadas:");
    for (double nota : notas) {
        System.out.print(nota + " - ");
    }

    int alunosPassaram = 0;
    for (double nota : notas) {
        if (nota >= 6.0) {
            alunosPassaram++;
        }
    }

    System.out.println("\\n" + (alunosPassaram == quantidade ? "Todos alunos passaram." : "Não foram todos alunos que passaram."));

ler.close();

}
}