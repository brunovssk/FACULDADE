import java.util.Scanner;

public class Exercicio10 {
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
        if (x + y <= z || x + z <= y || y + z <= x) {
           
            } else if (x == y && y == z) {
                System.out.println("equilátero.");
            } else if (x == y || x == z || y == z) {
                System.out.println("isósceles.");
            } else if ((x == y && x != z) || (x == z && x != y) || (y == z && y !=x)){
                System.out.println("escaleno.");
            } else {
            System.out.println("Não é um triângulo.");
        }
        
        ler.close();
    }
    }
