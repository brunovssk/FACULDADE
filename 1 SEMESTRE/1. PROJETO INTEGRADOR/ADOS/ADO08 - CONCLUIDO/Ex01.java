import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    int[] numeros = new int[5];

    for (int i = 0; i < numeros.length; i++) {
        System.out.print("Informe um número: ");
        numeros[i] = ler.nextInt();
    }

    System.out.println("Você digitou os números:");
    for (int numero : numeros) {
        System.out.println(numero);
    }
ler.close();

}
}