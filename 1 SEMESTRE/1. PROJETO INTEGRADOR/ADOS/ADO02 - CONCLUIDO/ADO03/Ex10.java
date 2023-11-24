import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as dimensões do primeiro cilindro:");
        double raio1 = obterRaio(scanner, "raio");
        double altura1 = obterAltura(scanner);

        System.out.println("\nInsira as dimensões do segundo cilindro:");
        double raio2 = obterRaio(scanner, "raio");
        double altura2 = obterAltura(scanner);

        double volume1 = calcularVolumeCilindro(raio1, altura1);
        double volume2 = calcularVolumeCilindro(raio2, altura2);

        if (podeTransferir(volume1, volume2)) {
            System.out.println("\nOs volumes dos cilindros podem ser transferidos.");
        } else {
            System.out.println("\nOs volumes dos cilindros não podem ser transferidos.");
        }

        scanner.close();
    }

    public static double obterRaio(Scanner scanner, String tipo) {
        System.out.print("Digite o " + tipo + " do cilindro em metros: ");
        return scanner.nextDouble();
    }

    public static double obterAltura(Scanner scanner) {
        System.out.print("Digite a altura do cilindro em metros: ");
        return scanner.nextDouble();
    }

    public static double calcularVolumeCilindro(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public static boolean podeTransferir(double volume1, double volume2) {
        return volume1 <= volume2;
    }
}
