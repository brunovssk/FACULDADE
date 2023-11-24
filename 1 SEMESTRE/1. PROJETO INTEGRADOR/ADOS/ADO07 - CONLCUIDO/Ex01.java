import java.util.Scanner;

public class Ex01 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int n = ler.nextInt();

    int soma = 0;
    for (int i = 1; i <= n; i++) {
        soma += i;
    }

    System.out.println("A soma dos números de 1 até " + n + " é " + soma);


    ler.close();
}
}