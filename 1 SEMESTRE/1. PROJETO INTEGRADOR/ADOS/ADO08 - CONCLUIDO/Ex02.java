import java.util.Scanner;

public class Ex02 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] nomes = new String[5];

    for (int i = 0; i < nomes.length; i++) {
        System.out.print("Informe um nome: ");
        nomes[i] = scanner.nextLine();
    }

    System.out.println("Você digitou os nomes:");
    for (String nome : nomes) {
        System.out.println(nome);
}
scanner.close();

}
}