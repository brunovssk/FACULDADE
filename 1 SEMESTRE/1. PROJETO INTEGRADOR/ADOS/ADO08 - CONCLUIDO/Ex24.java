import java.util.Scanner;

public class Ex24 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o nome do projeto: ");
        String nomeProjeto = ler.nextLine();

        int[] doacoes = new int[100];
        int quantidadeDoacoes = 0;
        int totalDoacoes = 0;

        while (true) {
            System.out.print("Informe o valor da doação (-1 para encerrar): ");
            int valorDoacao = ler.nextInt();

            if (valorDoacao == -1) {
                break;
            }

            doacoes[quantidadeDoacoes] = valorDoacao;
            quantidadeDoacoes++;
            totalDoacoes += valorDoacao;
        }

        System.out.println("O projeto " + nomeProjeto + " recebeu " + quantidadeDoacoes + " doações, totalizando " + totalDoacoes + " reais.");

        if (quantidadeDoacoes > 0) {
            System.out.println("As doações recebidas foram:");
            for (int i = 0; i < quantidadeDoacoes; i++) {
                System.out.print(doacoes[i]);
                if (i < quantidadeDoacoes - 1) {
                    System.out.print(" - ");
                }
            }
            System.out.println();
        } else {
            System.out.println("Nenhuma doação foi registrada.");
        }

        ler.close();
    }
}
