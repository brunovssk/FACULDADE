import java.util.Scanner;

public class Ex10 {

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Quantidade de números: ");
    int quantidade = ler.nextInt();

    int[] numeros = new int[quantidade];
    int[] dobros = new int[quantidade];

    for (int i = 0; i < quantidade; i++) {
        System.out.print("Informe o número na posição " + i + ": ");
        numeros[i] = ler.nextInt();
        dobros[i] = numeros[i] * 2;
    }

    System.out.println("Você digitou os números:");
    for (int numero : numeros) {
        System.out.println(numero);
    }

    System.out.println("O dobro de cada número é:");
    for (int i = 0; i < quantidade; i++) {
        System.out.println("O dobro de " + numeros[i] + " é " + dobros[i]);
    }

ler.close();

}
}