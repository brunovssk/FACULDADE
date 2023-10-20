import java.util.Scanner;

class Exercicio11 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String menuOpc;
        double resultado = 0, n1 = 0, n2 = 0, raiz = 0, potencia = 0;

        System.out.println("=== MENU DE OPÇÕES ===");
        System.out.println("Selecione a opção desejada:");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - Calcular a raiz quadrada de um número");
        System.out.println("3 - Calcular a potência de um número");

        menuOpc = ler.nextLine();

        if (menuOpc.equals("1")) {
            System.out.println("Informe os dois números para a soma: ");
            n1 = ler.nextDouble();
            n2 = ler.nextDouble();
            resultado = n1 + n2;
            
        } else if (menuOpc.equals("2")) {
            System.out.println("Informe o número para calcular a raiz: ");
            raiz = ler.nextDouble();
            resultado = Math.sqrt(raiz);

        } else if (menuOpc.equals("3")) {
            System.out.println("Informe um número e a potência para calcular: ");
            n1 = ler.nextDouble();
            potencia = ler.nextDouble();
            resultado = Math.pow(n1, potencia);
        } else {
            System.out.println("Opção inválida");
        }

        System.out.println("Resultado: " + resultado);

        ler.close();
    }
}
