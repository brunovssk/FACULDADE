import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Double nota;
        String nome, sobreNome;

        System.out.println("Informe o primeiro nome do candidato? ");
        nome = ler.nextLine();

        System.out.println("Informe o sobrenome do candidato? ");
        sobreNome = ler.nextLine();

        System.out.printf("Informe a sua nota: ");
        nota = ler.nextDouble();
        ler.nextLine();

        if (nota < 7.5) {
            System.out.println("Candidato: "+ nome +" " + sobreNome +" "+ "não foi aprovado");

        } else if (nota >= 7.5 && nota <= 8.0) {

            System.out.println("Candidato: " + nome +" "+ sobreNome +" "+"esta em lista de Espera");

        } else {
            System.out.println("Candidato: "+ nome +" "+ sobreNome+" "+"foi Aprovado =D");
        }
        
        ler.close();
    }
}
