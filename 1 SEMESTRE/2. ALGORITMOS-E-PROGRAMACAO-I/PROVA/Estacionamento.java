import java.util.Scanner;

public class Estacionamento {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String cpf;

        System.out.println("Informe a placa do veículo: ");
        String placaVeiculo = ler.nextLine();

        System.out.println("Informe a hora de entrada (HH): ");
        int horaEntrada = ler.nextInt();

        System.out.println("Informe o minuto de entrada (MM): ");
        int minutoEntrada = ler.nextInt();

        System.out.println("Informe a hora de saída (HH): ");
        int horaSaida = ler.nextInt();

        System.out.println("Informe o minuto de saída (MM): ");
        int minutoSaida = ler.nextInt();
        ler.nextLine();       

        System.out.println("Deseja incluir o CPF no recibo? (1 - sim, 0 - não): ");
        int opcaoCpf = ler.nextInt();

        int horas = horaSaida - horaEntrada;
        int minutos = minutoSaida - minutoEntrada;
        int tempoPermanencia = horas * 60 + minutos;
        int valorHora = 6;
        int valorMinuto = 1;
        float valorTotal = 0;

        if (tempoPermanencia <= 15) {
            valorTotal = 0;
        } else if (tempoPermanencia <= 60) {
            valorTotal = valorHora;
        } else if (tempoPermanencia <= 120) {
            valorTotal = valorHora * 2;
        } else if (tempoPermanencia <= 240) {
            valorTotal = valorHora * 3;
        } else if (tempoPermanencia <= 360) {
            valorTotal = valorHora * 4;
        } else {
            valorTotal = valorHora * 6 + (tempoPermanencia - 360) * valorMinuto;
        }

        String recibo = "Shop Gaste Bem - Rede Pare Bem\n" +
                "Placa do Veiculo= " + placaVeiculo + ": \n" +
                "Entrada: " + horaEntrada + ":" + minutoEntrada + "\n" +
                "Saida: " + horaSaida + ":" + minutoSaida + "\n" +
                "Permanencia: " + horas + " horas " + minutos + " minutos\n" +
                "Valor Total: R$ " + valorTotal;
                

        if (opcaoCpf == 1) {
            System.out.println("Informe o CPF do cliente: ");
            ler.nextLine();
            cpf = ler.nextLine();
            recibo += "\nCPF: " + cpf;
        }

        System.out.println(recibo);
    }
}
