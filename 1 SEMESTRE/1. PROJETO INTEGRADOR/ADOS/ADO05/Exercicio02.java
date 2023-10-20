import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String vermelho = "Vermelho";
        String azul = "Azul";
        String rosa = "Rosa";
        String roxo = "Roxo";

        System.out.println("<<<PROGRAMA DE CORES>>>");
        System.out.println("Escolha das 3 cores abaixo, duas para mostrar suas combinações: ");
        System.out.println("1) Vermelho");
        System.out.println("2) Azul");
        System.out.println("3) Rosa");

        System.out.println("Informe a primeira cor: ");
        String primeiraCor = ler.nextLine();

        System.out.println("Informe a segunda cor: ");
        String segundaCor = ler.nextLine();

        if ((primeiraCor.equals(vermelho) && segundaCor.equals(azul)) || (primeiraCor.equals(azul) && segundaCor.equals(vermelho))) {
            System.out.println("A combinação das cores vermelha + azul é = " + roxo);
        } else if (primeiraCor.equals(vermelho) && segundaCor.equals(rosa)) {
            System.out.println("Apenas cores primárias são aceitas");
            
        } else if (primeiraCor.equals(vermelho) && segundaCor.equals(vermelho)){
            System.out.println("A combinação da cor vermelho + vermelho é = " + vermelho);
        } else {
            System.out.println("As cores selecionadas não têm uma combinação definida.");
        }        

        ler.close();
    }
}
