import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe a sigla do curso: ");
        System.out.println("Exemplos abaixo:");
        System.out.println("SI = Sistemas de Informação");
        System.out.println("ADS = Análise e Desenvolvimento de Sistemas");
        System.out.println("CS = Ciência da Computação");
        System.out.println("EC = Engenharia da Computação");
        System.out.println("ES = Engenharia de Software");
        String siglaCurso = ler.nextLine().toUpperCase();

        System.out.println("O aluno é isento da mensalidade? (sim ou não): ");
        String isentoStr = ler.nextLine();
        boolean isento = isentoStr.equalsIgnoreCase("sim");

        double valorMensalidade = 0.0;

        if (!isento) {
            switch (siglaCurso) {
                case "SI":
                    valorMensalidade = 550.0;
                    break;
                case "ADS":
                    valorMensalidade = 750.0;
                    break;
                case "CS":
                    valorMensalidade = 1150.0;
                    break;
                case "EC":
                    valorMensalidade = 1300.0;
                    break;
                case "ES":
                    valorMensalidade = 950.0;
                    break;
                default:
                    System.out.println("Sigla do curso inválida.");
                    return;
            }

            System.out.println("Informe o desconto sem % (0 se nenhum): ");
            double descontoPorcentagem = ler.nextDouble();

            if (descontoPorcentagem > 0 && descontoPorcentagem <= 100) {
                double desconto = (descontoPorcentagem / 100) * valorMensalidade;
                valorMensalidade -= desconto;
            }
        }

        System.out.println("O valor da mensalidade é: R$" + valorMensalidade);

        ler.close();
    }
}
