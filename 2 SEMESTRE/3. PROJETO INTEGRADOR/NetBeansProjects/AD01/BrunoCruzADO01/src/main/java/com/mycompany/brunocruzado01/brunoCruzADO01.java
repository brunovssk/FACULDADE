package com.mycompany.brunocruzado01;

/**
 * @author bruno
 */
public class brunoCruzADO01 {
    public static void main(String[] args) {
     
        brutossauro brutossauro1 = new brutossauro("RexOna", "Masculino", 1500.0, 5);       

        // TODO EXIBIR NOMES
        System.out.println("Nome do brutossauro 1: " + brutossauro1.getNome());
        
        // TODO chamar metodos 
        brutossauro1.rugir();
        brutossauro1.correr();
    }
}
