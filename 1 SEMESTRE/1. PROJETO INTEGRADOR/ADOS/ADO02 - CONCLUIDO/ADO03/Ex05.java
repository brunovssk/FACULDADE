import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pergunta: Qual é o personagem de Friends que trabalha com TI?");
        System.out.print("Sua resposta: ");
        
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("Chandler")) {
            System.out.println("Parabéns! Sua resposta está correta.");
        } else {
            System.out.println("Ops! Sua resposta está incorreta. O personagem correto é Chandler.");
        }

        scanner.close();
    }
}
