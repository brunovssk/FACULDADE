import java.util.Scanner;

public class Ex03 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Quantos números você deseja digitar? ");
    int quantidade = scanner.nextInt();

    int[] numeros = new int[quantidade];

    for (int i = 0; i < quantidade; i++) {
        System.out.print("Informe um número: ");
        numeros[i] = scanner.nextInt();
    }

    System.out.println("Você digitou os números:");
    for (int numero : numeros) {
        System.out.println(numero);
    }

scanner.close();

}
}