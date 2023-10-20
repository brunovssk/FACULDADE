import java.util.Scanner;

class SalarioLiquido {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    double salarioLiquido,salarioBruto,gratificacao, imposto;

    System.out.println("Informe o salario liquido: ");
    salarioLiquido = ler.nextDouble();

    System.out.println("Informe a gratificação: ");
    gratificacao= ler.nextDouble();

    salarioBruto = salarioLiquido + gratificacao;

    if(salarioBruto == 2.500){
      imposto = (salarioBruto * 10.0 / 100);
    }
    else {
      imposto = (salarioBruto * 15.0 / 100);
    }

    //Calculo
    salarioLiquido = salarioLiquido - imposto;

    System.out.println("Salario Bruto = " + salarioBruto);
    System.out.println("Salario Liquido = " + salarioLiquido);
    System.out.println("Sua Gratificao = " + gratificacao);    
    System.out.println("Imposto a pagar = " + imposto);

    ler.close();
  }
}
