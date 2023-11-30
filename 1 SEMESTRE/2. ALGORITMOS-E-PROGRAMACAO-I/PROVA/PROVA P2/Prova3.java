import java.util.Random;

public class Prova3 {

    public static void main(String[] args) {
        int[][] matriz = gerarMatriz(4, 4);
        System.out.println("Matriz:");
        imprimirMatriz(matriz);

        double razao = calcularRazao(matriz);
        System.out.println("\nRazão (soma das colunas pares / soma das linhas ímpares): " + razao);
    }

    private static int[][] gerarMatriz(int l, int c) {
        int[][] matriz = new int[l][c];
        Random random = new Random();

        for (int i = 0; i < l; i++)
            for (int j = 0; j < c; j++)
                matriz[i][j] = random.nextInt(10) + 1;

        return matriz;
    }

    private static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.print(m[i][j] + "\t");
            System.out.println();
        }
    }

    private static double calcularRazao(int[][] m) {
        int soma1 = 0;
        int soma2 = 0;

        for (int i = 0; i < m.length; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < m[0].length; j++)
                soma1 += m[i][j];
            } else {
                for (int j = 0; j < m[0].length; j += 2)
                soma2 += m[i][j];
            }
        }

        if (soma1 == 0) {
            System.out.println("A soma das linhas ímpares é zero. Não calculavel.");
            return Double.NaN;
        }

        return (double) soma1 / soma2;
    }
}
