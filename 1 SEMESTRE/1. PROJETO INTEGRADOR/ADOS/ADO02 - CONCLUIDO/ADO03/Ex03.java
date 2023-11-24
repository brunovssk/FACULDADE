import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as dimensões do primeiro retângulo:");
        double comprimento1 = scanner.nextDouble();
        double largura1 = scanner.nextDouble();

        System.out.println("Digite as dimensões do segundo retângulo:");
        double comprimento2 = scanner.nextDouble();
        double largura2 = scanner.nextDouble();

        double area1 = calcularArea(comprimento1, largura1);
        double area2 = calcularArea(comprimento2, largura2);

        if (area1 == area2) {
            System.out.println("Os retângulos têm a mesma área.");
        } else {
            System.out.println("Os retângulos não têm a mesma área.");
        }

        scanner.close();
    }

    private static double calcularArea(double comprimento, double largura) {
        return comprimento * largura;
    }
}
