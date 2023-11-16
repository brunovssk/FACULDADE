//Crie um algoritmo que receba como entrada o sexo de uma pessoa (M para 
//Masculino e F para Feminino), sua altura (em centímetros) e calcule o seu peso 
//ideal, utilizando as seguintes fórmulas: 
//a) Homens ➔ 52 + (0,75 * (altura - 152,4)) 
//b) Mulheres ➔ 52 + (0,67 * (altura - 152,4)) 

import java.util.Scanner;

class Exercicio06 {
  public static void main(String[] args) {

Scanner ler = new Scanner(System.in);

    String sexo= "";
    double altura,peso;

    System.out.println("Informe o seu sexo");
    sexo = ler.nextLine();

    System.out.println("Informe a sua altura em centimetros");
    altura = ler.nextDouble();

    if (sexo.equals("M")) {
    peso = 52 + (0.75 * (altura - 152.4)); 
    } else  {
    peso = 52 + (0.67 * (altura - 152.4));
    }

    System.out.printf("O seu peso ideal é %.1f", peso);

    ler.close();

  }
}
