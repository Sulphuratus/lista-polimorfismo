package br.edu.iftm.herancapoli;

public class Reptil extends Animal{

    private String corEscama;

    /*public Reptil(double peso, int idade, int membros, String corEscama){
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }*/

    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo plantas e animais menores");
    }

    @Override
    public void emitirSom(){
        System.out.println("Fazendo barulho de réptil");
    }

    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
