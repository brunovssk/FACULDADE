import java.util.Scanner;

public class Fluxograma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
     
        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qual o seu sexo? (F/M)");
        String sexo = scanner.next();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        if (sexo.equals("M")) {
            System.out.println("Você é do sexo masculino.");
        } else if (sexo.equals("F")) {
            System.out.println("Você é do sexo feminino.");
        } else {
            System.out.println("Sexo inválido.");
        }

    }

}
