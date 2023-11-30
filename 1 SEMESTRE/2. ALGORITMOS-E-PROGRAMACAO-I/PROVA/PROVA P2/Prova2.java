import java.util.Scanner;

public class Prova2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        

        System.out.print("número de linhas: ");
        int linhas = scanner.nextInt();

        System.out.print("número de colunas: ");
        int colunas = scanner.nextInt();

        exMatriz(linhas, colunas);
    }

    public static void exMatriz(int linhas, int colunas) {
        char[][] matriz = new char[linhas][colunas];

        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (i % 6 == 0 || j == 0 || j == colunas - 1) {
                    matriz[i][j] = '=';
                }else {
                    matriz[i][j] = ' ';
                }
            }
        }

        
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
