import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um ano: ");
        int ano = sc.nextInt();

        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            System.out.println("\n" + ano + " é um ano bissexto");
        } else {
            int proximoAnoBissexto = ano + (4 - ano % 4);
            System.out.println("\n" + ano + " não é um ano bissexto. O próximo ano bissexto é " + proximoAnoBissexto);
        }
    }
}
