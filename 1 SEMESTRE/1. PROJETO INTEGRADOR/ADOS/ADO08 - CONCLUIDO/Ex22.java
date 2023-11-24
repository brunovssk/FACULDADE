import java.util.Scanner;

public class Ex22 {

    private static final String[] DIAS_DA_SEMANA = {
        "Domingo",
        "Segunda-feira",
        "Terça-feira",
        "Quarta-feira",
        "Quinta-feira",
        "Sexta-feira",
        "Sábado",
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número do dia da semana: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 7) {
            System.out.println(DIAS_DA_SEMANA[numero - 1]);
        } else {
            System.out.println("Número inválido. Informe um número de 1 a 7.");
        }

        scanner.close();
    }
}
