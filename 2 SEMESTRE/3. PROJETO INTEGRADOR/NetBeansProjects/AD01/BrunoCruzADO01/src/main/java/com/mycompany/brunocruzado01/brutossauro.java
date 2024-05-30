package com.mycompany.brunocruzado01;

/**
 * @author bruno
 */
public class brutossauro {
    
    private String nome;
    private String sexo;
    private double peso;
    private int idade;   
    
    // TODO Construtor
    public brutossauro() {
    }
    
    // TODO Construtor com os paramen
    public brutossauro(String nome, String sexo, double peso, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.peso = peso;
        this.idade = idade;
    }
    
    // TODO Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void rugir() {
        System.out.println(nome + " está rugindo furiosamente!");
    }

    public void correr() {
        System.out.println(nome + " está correndo loucamente!");
    }
}
