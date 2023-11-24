import java.util.Scanner;

public class Ex25 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do projeto de caridade: ");
        String nomeProjeto = scanner.nextLine();

        System.out.print("Digite a quantidade de doações recebidas: ");
        int quantidadeDoacoes = scanner.nextInt();
        System.out.print("Digite a meta do projeto: ");
        double metaProjeto = scanner.nextDouble();

        double[] doacoes = new double[quantidadeDoacoes];

        for (int i = 0; i < quantidadeDoacoes; i++) {
            System.out.print("Digite o valor da doação " + (i + 1) + ": ");
            doacoes[i] = scanner.nextDouble();
        }

        double totalArrecadado = 0;
        for (double doacao : doacoes) {
            totalArrecadado += doacao;
        }

        double maiorArrecadacao = 0;
        for (double doacao : doacoes) {
            if (doacao > maiorArrecadacao) {
                maiorArrecadacao = doacao;
            }
        }

        boolean metaAtingida = totalArrecadado >= metaProjeto;

        System.out.println("\nRelatório do Projeto " + nomeProjeto + ":");
        System.out.println("Total arrecadado: R$" + totalArrecadado);
        System.out.println("Maior arrecadação: R$" + maiorArrecadacao);
        System.out.println("Meta atingida: " + (metaAtingida ? "Sim" : "Não"));

        scanner.close();
    }
}
