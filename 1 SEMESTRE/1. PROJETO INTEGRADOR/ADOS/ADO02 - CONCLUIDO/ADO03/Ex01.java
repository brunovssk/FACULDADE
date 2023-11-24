import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura da pessoa em graus Celsius:");
        double temperatura = scanner.nextDouble();

        if (temperatura >= 37.3) {
            System.out.println("A pessoa está com febre.");
        } else {
            System.out.println("A pessoa não está com febre.");
        }

        scanner.close();
    }
}
