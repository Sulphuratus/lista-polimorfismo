package br.edu.iftm.herancapoli;

public class Canguru extends Mamifero{

    /*public Canguru (double peso, int idade, int membros, String corPelo){
        super(peso, idade, membros, corPelo);

    }*/

    public void usarBolsa(){
        System.out.println("Carregando algo na bolsa");
    }

    @Override
    public void locomover(){
        System.out.println("Saltando");
    }

    
    

}
