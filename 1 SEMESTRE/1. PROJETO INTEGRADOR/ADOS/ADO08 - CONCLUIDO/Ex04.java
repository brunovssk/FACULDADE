import java.util.Scanner;

public class Ex04 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos números você deseja digitar? ");
    int quantidade = scanner.nextInt();

    int[] numeros = new int[quantidade];

    for (int i = 0; i < quantidade; i++) {
        System.out.print("Informe um número: ");
        numeros[i] = scanner.nextInt();
    }

    for (int i = quantidade - 1; i >= 0; i--) {
        System.out.println(numeros[i]);
    }

scanner.close();

}
}