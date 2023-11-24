import java.util.Scanner;

public class Ex20 {

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

    boolean todosPassaram = true;
    for (double nota : notas) {
        if (nota < 6.0) {
            todosPassaram = false;
            break;
        }
    }

    System.out.println("\\n" + (todosPassaram ? "Todos alunos passaram." : "Não foram todos alunos que passaram."));

ler.close();

}
}