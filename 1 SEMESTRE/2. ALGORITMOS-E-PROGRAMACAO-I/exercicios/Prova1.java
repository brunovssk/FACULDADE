import java.util.Scanner;

class Prova1 {
    public static void main(String [] args){       
        Scanner ler = new Scanner(System.in);
                
        double gasolina = 4.79;
        double etanol = 3.65;
        double litros = 0;
        double desconto = 0;
        double custo = 0;
        
        System.out.println("Informe qual tipo de combustivel escolhendo entre:");
        System.out.println("1 - Gasolina:");       
        System.out.println("2 - Etanol:");
        String combustivel = ler.nextLine();

        System.out.println("Informe a qnt de Litros comprado?");
        litros = ler.nextDouble();
        
        if (combustivel.equals("1")){
            custo = litros * gasolina;
            if (litros <= 10){
                desconto = custo * 0.05;
            } else {
                desconto = custo * 0.07;
            } 
            custo = custo - desconto;
            System.out.printf("O valor do Gasolina que será pago é R$%.2f%n", custo);
        }

        if (combustivel.equals("2")){
            custo = litros * etanol;
            if (litros > 5){
                desconto = custo * 0.10;
            } 
            custo = custo - desconto;            
            System.out.printf("O valor do Etanol que será pago é R$%.2f%n", custo);
        }       
    ler.close();
    }    
}
