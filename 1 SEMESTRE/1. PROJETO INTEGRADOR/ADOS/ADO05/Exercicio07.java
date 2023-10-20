import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInteira = 28.50;
        double valorMeia = valorInteira / 2;
        double valorQuarta = 14.25;
        double valorNacional = 5.00;

        System.out.println("Bem-vindo à calculadora de preços de ingressos do cinema!");
        System.out.println("Digite a quantidade de ingressos Inteiras: ");
        int quantidadeInteira = scanner.nextInt();

        System.out.println("Digite a quantidade de ingressos Meias: ");
        int quantidadeMeia = scanner.nextInt();

        System.out.println("Digite o dia da semana (ex: segunda, terça, quarta, etc.): ");
        String diaSemana = scanner.next().toLowerCase();

        System.out.println("O filme é nacional? Responda com Sim ou Não: ");
        String resposta = scanner.next().toLowerCase();

        boolean Nacional = resposta.equals("sim");
        boolean Quarta = diaSemana.equals("quarta");

        double totalPagar = 0.0;

        if (Nacional) {
            totalPagar = (quantidadeInteira + quantidadeMeia) * valorNacional;
        } else if (Quarta) {
            totalPagar = (quantidadeInteira + quantidadeMeia) * valorQuarta;
        } else {
            totalPagar = (quantidadeInteira * valorInteira) + (quantidadeMeia * valorMeia);
        }

        System.out.println("O valor total a pagar é R$: " + totalPagar);

        scanner.close();
    }
}
