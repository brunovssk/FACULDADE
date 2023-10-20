import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o valor da hora/aula:");
        float valorHora = ler.nextFloat();

        System.out.println("Digite a quantidade de aulas por semana:");
        int aulasSemanais = ler.nextInt();

        // Cálculo do salário bruto
        float salarioBase = (aulasSemanais * 4.5f) * valorHora;
        float adicionalAtividade = salarioBase * 0.05f;
        float descansoSemanal = (salarioBase + adicionalAtividade) / 6;
        float salarioBruto = salarioBase + adicionalAtividade + descansoSemanal;

        // Cálculo do desconto do INSS
        float descontoINSS = 0;
        if (salarioBruto <= 1302) {
            descontoINSS = salarioBruto * 0.075f;
        } else if (salarioBruto <= 2571.29f) {
            descontoINSS = salarioBruto * 0.09f - 19.53f;
        } else if (salarioBruto <= 3856.94f) {
            descontoINSS = salarioBruto * 0.12f - 96.67f;
        } else {
            descontoINSS = salarioBruto * 0.14f - 173.81f;
        }

        // Cálculo do desconto do IRSS
        float descontoIRSS = 0;
        if (salarioBruto > 2112 && salarioBruto <= 2826.65f) {
            descontoIRSS = salarioBruto * 0.075f - 158.4f;
        } else if (salarioBruto <= 3751.05f) {
            descontoIRSS = salarioBruto * 0.15f - 370.4f;
        } else if (salarioBruto <= 4664.68f) {
            descontoIRSS = salarioBruto * 0.225f - 651.73f;
        } else {
            descontoIRSS = salarioBruto * 0.275f - 884.96f;
        }

        // Cálculo do salário líquido
        float salarioLiquido = salarioBruto - descontoINSS - descontoIRSS;

        // Exibição dos resultados
        System.out.printf("Salário Bruto: %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS: %.2f%n", descontoINSS);
        System.out.printf("Desconto IRSS: %.2f%n", descontoIRSS);
        System.out.printf("Salário Líquido: %.2f%n", salarioLiquido);

        ler.close();
    }
}
