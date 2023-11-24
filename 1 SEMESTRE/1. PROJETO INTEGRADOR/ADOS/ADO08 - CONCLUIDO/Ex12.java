import java.util.Scanner;

public class Ex12 {
public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.print("Quantidade de pilotos: ");
    int quantidade = ler.nextInt();

    int[] largada = new int[quantidade];
    int[] chegada = new int[quantidade];

    for (int i = 0; i < quantidade; i++) {
        System.out.print("Informe a posição do piloto " + i + " na largada: ");
        largada[i] = ler.nextInt();
    }

    for (int i = 0; i < quantidade; i++) {
        System.out.print("Informe a posição do piloto " + i + " na chegada: ");
        chegada[i] = ler.nextInt();
    }

    for (int i = 0; i < quantidade; i++) {
        int diferenca = chegada[i] - largada[i];

        if (diferenca > 0) {
            System.out.println("O piloto " + i + " avançou " + diferenca + " posições");
        } else if (diferenca < 0) {
            System.out.println("O piloto " + i + " retrocedeu " + (-diferenca) + " posições");
        } else {
            System.out.println("O piloto " + i + " manteve a posição");
        }
    }

ler.close();

}
}