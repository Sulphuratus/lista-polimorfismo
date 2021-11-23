package br.edu.iftm.herancapoli;

public class Peixe extends Animal{

    private String corEscama;

    /*public Peixe(double peso, int idade, int membros, String corEscama){
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }*/

    @Override
    public void locomover(){
        System.out.println("Nadando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo plantas, insetos e peixes menores");
    }

    @Override
    public void emitirSom(){
        System.out.println("Fazendo barulho de peixe");
    }

    
    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }


    public String getCorEscama() {
        return this.corEscama;
    }

    public void setCorEScama(String corEscama) {
        this.corEscama = corEscama;
    }

    
}
