import java.util.Scanner;

public class Ex08 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Quantidade de números: ");
    int quantidade = ler.nextInt();

    int[] numeros = new int[quantidade];

    for (int i = 0; i < numeros.length; i++) {
        numeros[i] = (int) Math.floor(Math.random() * 100);
    }

    System.out.println("Os números gerados aleatoriamente foram:");
    for (int numero : numeros) {
        System.out.println(numero);
    }

ler.close();

}
}