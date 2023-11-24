import java.util.Scanner;

public class Ex07 {

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Quantidade de ingressos: ");
    int quantidade = ler.nextInt();

    System.out.print("Sigla do ingresso: ");
    String sigla = ler.next();

    String[] ingressos = new String[quantidade];

    for (int i = 0; i < ingressos.length; i++) {
        ingressos[i] = sigla + "_" + (i + 1);
    }

    System.out.println("Os ingressos gerados foram:");
    for (String ingresso : ingressos) {
        System.out.println(ingresso);
    }
}
}