import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        // Ler os comprimentos dos lados do triângulo
        System.out.println("Digite o comprimento do lado X: ");
        double x = ler.nextDouble();

        System.out.println("Digite o comprimento do lado Y: ");
        double y = ler.nextDouble();

        System.out.println("Digite o comprimento do lado Z: ");
        double z = ler.nextDouble();

        // Verificar se os lados formam um triângulo
        if (x + y > z && x + z > y && y + z > x) {
            if (x == y && y == z) {
                System.out.println("Um triângulo equilátero.");
            } else if (x != y && x != z && y != z){
                System.out.println("Um triângulo escaleno.");
            } else {
                System.out.println("Um triângulo isósceles.");
            }
        } else {
            System.out.println("Não é um triângulo.");
        }
        
        ler.close();
    }
}
