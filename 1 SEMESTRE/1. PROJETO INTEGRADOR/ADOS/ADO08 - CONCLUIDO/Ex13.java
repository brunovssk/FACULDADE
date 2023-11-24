import java.util.Scanner;

public class Ex13 {

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Quantidade de números: ");
    int quantidade = ler.nextInt();

    int[] numeros = new int[quantidade];

    for (int i = 0; i < quantidade; i++) {
        System.out.print("Informe o número na posição " + i + ": ");
        numeros[i] = ler.nextInt();
    }

    System.out.println("Você digitou os números:");
    for (int numero : numeros) {
        System.out.println(numero);
    }

    System.out.println("Os números pares são:");
    for (int numero : numeros) {
        if (numero % 2 == 0) {
            System.out.println(numero);
        }
}

ler.close();

}
}