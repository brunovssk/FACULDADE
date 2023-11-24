import java.util.Scanner;

public class Ex23 {

    private static final String[] MESES = {
        "Janeiro",
        "Fevereiro",
        "Março",
        "Abril",
        "Maio",
        "Junho",
        "Julho",
        "Agosto",
        "Setembro",
        "Outubro",
        "Novembro",
        "Dezembro",
    };

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe o número do mês: ");
        int numero = ler.nextInt();

        if (numero >= 1 && numero <= 12) {
            System.out.println(MESES[numero - 1]);
        } else {
            System.out.println("Número inválido. Informe um número de 1 a 12.");
        }

        ler.close();
    }
}
