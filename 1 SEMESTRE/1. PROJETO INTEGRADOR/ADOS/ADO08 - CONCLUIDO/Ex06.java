import java.util.Scanner;

public class Ex06 {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe uma frase: ");
    String frase = scanner.nextLine();

    char[] arrayFrase = frase.toCharArray();

    System.out.println("Os itens do Array são:");
    for (char caractere : arrayFrase) {
        System.out.println(caractere);
    }

scanner.close();

}
}