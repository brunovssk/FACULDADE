import java.util.Scanner;

class Exercicio14 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double nota1,nota2,nota3,media,media2,notaRecuperacao;
    String situacao = "";

    System.out.println("Informe a primeira nota: ");
    nota1 = ler.nextDouble();

    System.out.println("Informe a segunda nota: ");
    nota2 = ler.nextDouble();

    System.out.println("Informe a terceira nota: ");
    nota3 = ler.nextDouble();

    media = (nota1 + nota2 + nota3) / 3;

    if (media < 5) {
      situacao = "REPROVADO";
    }

    else if (media >= 5 && media < 6) {
    situacao = "RECUPERACÃO";
    System.out.println("Informe a nota da atividade de recuperação: ");
    notaRecuperacao = ler.nextDouble();

    media2 = (media + notaRecuperacao) / 2;

        if (media2 >= 6) {
            situacao = "Aprovado por recuperação";
        } else {
            situacao = "Reprovado por recuperacao";
        }
        
    } else {
      situacao = "APROVADO";

    }
    System.out.println("Voce foi = " + situacao);
  }
}