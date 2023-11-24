import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do livro: ");
        String nomeLivro = scanner.nextLine();

        System.out.print("Digite o total de páginas do livro: ");
        int totalPaginas = scanner.nextInt();

        System.out.print("Digite o tempo de leitura por página em segundos: ");
        int tempoLeituraPorPagina = scanner.nextInt();

        int tempoTotalLeitura = calcularTempoLeitura(totalPaginas, tempoLeituraPorPagina);

        System.out.println("Tempo estimado para ler '" + nomeLivro + "': " + formatarTempo(tempoTotalLeitura));

        scanner.close();
    }

    public static int calcularTempoLeitura(int totalPaginas, int tempoLeituraPorPagina) {
        return totalPaginas * tempoLeituraPorPagina;
    }

    public static String formatarTempo(int segundos) {
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int segundosRestantes = segundos % 60;

        return String.format("%02d:%02d:%02d", horas, minutos, segundosRestantes);
    }
}
