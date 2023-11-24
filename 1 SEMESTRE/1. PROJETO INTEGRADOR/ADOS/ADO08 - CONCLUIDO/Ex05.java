import java.util.Scanner;

public class Ex05 {

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Informe um número: ");
    int numero = ler.nextInt();

    int[] tabuada = new int[11];

    for (int i = 0; i <= 10; i++) {
        tabuada[i] = numero * i;
    }

    System.out.println("A tabuada do " + numero + " é:");
    for (int numeroTabuada : tabuada) {
        System.out.println(numeroTabuada);
    }

ler.close();

}

}