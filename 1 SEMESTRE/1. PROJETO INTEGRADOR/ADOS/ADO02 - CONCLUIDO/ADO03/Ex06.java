import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cor do semáforo (vermelho, amarelo, verde): ");
        String corSemafaro = scanner.nextLine();

        if (corSemafaro.equalsIgnoreCase("verde")) {
            System.out.println("Pedestre pode atravessar.");
        } else if (corSemafaro.equalsIgnoreCase("amarelo") || corSemafaro.equalsIgnoreCase("vermelho")) {
            System.out.println("Pedestre deve aguardar.");
        } else {
            System.out.println("Cor do semáforo inválida.");
        }

        scanner.close();
    }
}
