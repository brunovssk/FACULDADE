import java.util.Scanner;

class Exercicio12 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("====================");
    System.out.println("==PROGRAMA DO JOGO==");
    System.out.println("====================");

    double horaInicial,horaFinal,minutoInicial,minutoFinal,duracaoHora,duracaoMinuto;

    System.out.println("Informe a hora inicial: ");
    horaInicial = ler.nextDouble();

    System.out.println("Informe a hora final: ");
    horaFinal = ler.nextDouble();

    System.out.println("Informe a minuto inicial: ");
    minutoInicial = ler.nextDouble();

    System.out.println("Informe a minuto final: ");
    minutoFinal = ler.nextDouble();

    duracaoHora = horaFinal - horaInicial;

      if (horaFinal < horaInicial){
        duracaoHora += 60;
    }

    duracaoMinuto = minutoFinal - minutoInicial;
      if (minutoFinal < minutoInicial){
        duracaoMinuto +=60;
        duracaoHora --;
      }

    System.out.printf("A duração do jogo é: " + duracaoHora +
    duracaoMinuto);
  }
}