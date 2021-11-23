package br.edu.iftm.herancapoli;

public abstract class Animal {

    // Atributos de Animal
    protected double peso;
    protected int idade;
    protected int membros;

    /*
    public Animal(double peso, int idade, int membros){
        this.peso = peso;
        this.idade = idade;
        this.membros = membros;
    }*/
    
    // Métodos de Animal
    public abstract void locomover();

    public abstract void alimentar();

    public abstract void emitirSom();


    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return this.membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }

}
