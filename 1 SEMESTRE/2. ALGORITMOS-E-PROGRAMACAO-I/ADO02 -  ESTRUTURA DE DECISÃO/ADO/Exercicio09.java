import java.util.Scanner;

class Exercicio9 {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    double imc,peso,altura;
    String classificacao = "";

    System.out.println("Informe o seu peso: ");
    peso = ler.nextDouble();

    System.out.println("Informe o sua altura: ");
    altura = ler.nextDouble();

    imc = peso / altura;

    if(imc <= 16) {
      classificacao = "Magreza Severa";
      }
    else if (imc >= 17) {
      classificacao = "Magreza Moderada";
    }
    else if (imc >= 18.5) {
      classificacao = "Magreza Leve";
    }
    else if (imc >= 25) {
      classificacao = "Peso Normal";
    }
    else if (imc >= 30) {
      classificacao = "Obesidade Leve";
    }
    else if (imc >= 40) {
      classificacao = "Obesidade Severa";
    }
    else if (imc > 40) {
      classificacao = "Obesidade Mórbida";
    }
    
    System.out.println(classificacao);

  }
}