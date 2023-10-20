import java.util.Scanner;

class Exercicio04 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    double n1,n2, calculo;
    String opcao = "[1-6]";      
    System.out.println("PROGRAMA DA CALCULADORA"); 

    System.out.println("<<<Selecione as opções abaixo>>>: ");
    System.out.println("Opção de soma = 1 ");
    System.out.println("Opção de subtração = 2 ");
    System.out.println("Opção de multiplicação = 3 ");
    System.out.println("Opção de divisão = 4 ");
    System.out.println("Opção de resto da divisão = 5 ");
    System.out.println("Opção de potência = 6 ");    
    opcao = ler.nextLine();

    System.out.println("informe o primeiro numero: ");
    n1 = ler.nextInt();

    System.out.println("informe o segundo numero: ");
    n2 = ler.nextInt();

    if (opcao.equals("1")) {
        calculo = n1 + n2;
        System.out.println("O resultado da soma é: " + calculo);
    } else if (opcao.equals("2")){
        calculo = n1 - n2;
        System.out.println("O resultado da subtração é: " + calculo);
    } else if (opcao.equals("3")){
        calculo = n1 * n2;
        System.out.println("O resultado da multiplicação é: " + calculo);
    } else if (opcao.equals("4")){
        calculo = n1 / n2;
        System.out.println("O resultado da divisão é: " + calculo);
    } else if (opcao.equals("5")){
      calculo = n1 % n2;
      System.out.println("O resultado do resto da divisão é: " + calculo);
    } else if(opcao.equals("6")){
      calculo = Math.pow(n1, n2);
      System.out.println("O resultado da potencia é: " + calculo);
    } else{
      System.out.println("Operação nao suportada");
    }
    ler.close();
  }
}

