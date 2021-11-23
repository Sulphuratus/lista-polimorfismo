package br.edu.iftm.herancapoli;

public class Ave extends Animal {
    
    private String corPena;

    /*public Ave(double peso, int idade, int membros, String corPena){
        super(peso, idade, membros);
        this.corPena = corPena;
    }*/

    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo frutas, insetos e outros animais menores");
    }

    @Override
    public void emitirSom(){
        System.out.println("Cantando");
    }

    
    public void fazerNinho(){
        System.out.println("Construindo ninhos");
    }


    public String getCorPena() {
        return this.corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
