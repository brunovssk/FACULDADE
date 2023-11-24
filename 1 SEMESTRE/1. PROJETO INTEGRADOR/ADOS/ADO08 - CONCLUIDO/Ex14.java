import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de nomes a serem armazenados: ");
        int quantidadeNomes = scanner.nextInt();
        scanner.nextLine();

        String[] nomes = new String[quantidadeNomes];

        for (int i = 0; i < quantidadeNomes; i++) {
            System.out.print("Digite o nome para a posição " + i + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.println("Nomes que iniciam com 'L':");
        for (int i = 0; i < quantidadeNomes; i++) {
            if (nomes[i].toUpperCase().startsWith("L")) {
                System.out.println(nomes[i]);
            }
        }

        scanner.close();
    }
}
