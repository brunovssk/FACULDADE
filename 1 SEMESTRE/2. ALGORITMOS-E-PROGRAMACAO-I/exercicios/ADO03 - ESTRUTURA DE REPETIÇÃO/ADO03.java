public class ADO03 {

    public static void main(String[] args) {
        final int UPPER_LIMIT = 9500;
        imprimirDivisiveisPor3(50, UPPER_LIMIT);
        System.out.println("\n----------------------------------------");
        imprimirMultiplosDe10(1, 250);
    }

    private static void imprimirDivisiveisPor3(int start, int end) {
        System.out.println("Números divisíveis por 3 entre " + start + " e " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void imprimirMultiplosDe10(int start, int end) {
        System.out.println("Múltiplos de 10 até " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.println("Múltiplo de 10");
            } else {
                System.out.println(i);
            }
        }
    }
}

public class SomaSequencia {

    public static void main(String[] args) {
        int limite = 100;
        int soma = calcularSomaSequencia(limite);
        System.out.println("A soma dos termos da sequência é: " + soma);
    }

    private static int calcularSomaSequencia(int limite) {
        int soma = 0;
        for (int i = 1; i <= limite; i++) {
            soma += i;
        }
        return soma;
    }
}
