import java.util.Scanner;

class Premiacao {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    double n1,n2,n3,n4,mediaNotas,mediaFaltas,qtdAulasDadas,qtdPresenca;
    String requisito,premio = "";

    System.out.println("==PROGRAMA DA PREMIAÇÃO==");   

    System.out.println("Digite a primeira nota: ");
    n1 = ler.nextDouble();

    System.out.println("Digite a segunda nota: ");
    n2 = ler.nextDouble();

    System.out.println("Digite a terceira nota: ");
    n3 = ler.nextDouble();

    System.out.println("Digite a quarta nota: ");
    n4 = ler.nextDouble();

    System.out.println("Informe a quantidade de aulas dadas: ");
    qtdAulasDadas = ler.nextDouble();

    System.out.println("Informe a quantidade de presença: ");
    qtdPresenca = ler.nextDouble();

    mediaNotas = (n1+n2+n3+n4) / 4;
    mediaFaltas = (qtdPresenca * 100) / qtdAulasDadas;

    if(mediaNotas > 80 && mediaFaltas == 100) {
      premio = "Excursão";
    }
    else if (mediaNotas > 80 && mediaFaltas == 100) {
      premio = "Camiseta";
    }
    else if  (mediaNotas > 70 && mediaNotas < 80 && mediaFaltas == 90) {
      premio = "Squeeze";
    }
    else if (mediaNotas > 70 && mediaNotas < 80 && mediaFaltas >= 90) {
      premio = "Caneta personalizada";
    }
    else {
      premio = "Não há prêmios";
    }

    System.out.println("Sua premiação é: " + premio);
  }
}
