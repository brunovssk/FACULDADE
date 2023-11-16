import java.util.Scanner;

class Exercicio8 {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        double salario, novoSalario, bonus = 0, auxilioEscola = 0;

        System.out.println("Informe o seu salario: ");
        salario = ler.nextDouble();

        if (salario < 2000.00)
            bonus = salario * (10.0 / 100);
            else if (salario >= 2000.00 && salario <= 3000.00) {
            bonus = salario * (8.0 / 100);
            } else if (salario > 3000.00) {
            bonus = salario * (5.0 / 100);
        }

        if (salario <= 2500.00) {
            auxilioEscola += 350.00;
        } else {
            auxilioEscola += 300.00;
        }

        novoSalario = salario + bonus + auxilioEscola;

        System.out.print("O Seu novo salario: " + novoSalario);    

    }
}