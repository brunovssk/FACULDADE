import java.util.Random;
import java.util.Scanner;

public class Prova1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);              

        //por tipo de Categoria
        int tipoAposentados = 0;
        int menorIdade = 0;
        int somarIdades = 0;

        //por tipo de Atração
        int qtdAtracaoFamiliar = 0;
        int qtdAtracaoAventura = 0;

        Random random = new Random();

        for (int i = 0; i < 700; i++) {
            int idade = random.nextInt(80) + 1;

            String tipoAtracao = (random.nextBoolean()) ? "Tipo familiar ou" : "Tipo aventura";

            if (idade >= 70) {
                tipoAposentados++;
            }

            if (idade < 18) {
                menorIdade++;
            }

            somarIdades += idade;

            if (tipoAtracao.equals("familia")) {
                qtdAtracaoFamiliar++;
            } else {
                qtdAtracaoAventura++;
            }
        }
      
        double mediaIdade = (double) somarIdades / 700;

        System.out.println("|=================================================|");
        System.out.println("|=================================================|");
        System.out.println("|=================================================|");
        System.out.println("Qtd. de aposentados " + tipoAposentados);
        System.out.println("Qtd. de menor de idaide: " + menorIdade);
        System.out.println("Media de idade visitante: " + String.format("%.2f", mediaIdade));
        System.out.println("|=================================================|");
        System.out.println("|=================================================|");
        System.out.println("|=================================================|");
        System.out.println("Qtd de visitantes por tipo de atração:");
        System.out.println("Visitantes Familiar: " + qtdAtracaoFamiliar);
        System.out.println("Visitantes Aventura: " + qtdAtracaoAventura);
        System.out.println("|=================================================|");
        System.out.println("|=================================================|");
        System.out.println("|=================================================|");
    }
}


           