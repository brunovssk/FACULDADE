import java.util.Scanner;

public class Ex11 {

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Quantidade de números: ");
    int quantidade = ler.nextInt();

    int[] vetor1 = new int[quantidade];
    int[] vetor2 = new int[quantidade];

    for (int i = 0; i < quantidade; i++) {
        System.out.print("Informe o número na posição " + i + ": ");
        vetor1[i] = ler.nextInt();
    }

    for (int i = 0; i < quantidade; i++) {
        System.out.print("Informe o número na posição " + i + ": ");
        vetor2[i] = ler.nextInt();
    }

    int[] resultado = new int[quantidade];

    for (int i = 0; i < quantidade; i++) {
        resultado[i] = vetor1[i] + vetor2[i];
    }

    System.out.println("Primeiro vetor:");
    for (int numero : vetor1) {
        System.out.println(numero);
    }

    System.out.println("Segundo vetor:");
    for (int numero : vetor2) {
        System.out.println(numero);
    }

    System.out.println("A soma dos vetores, resulta no terceiro:");
    for (int numero : resultado) {
        System.out.println(numero);
    }

ler.close();

}
}