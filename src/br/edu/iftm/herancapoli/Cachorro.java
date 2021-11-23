package br.edu.iftm.herancapoli;

public class Cachorro extends Lobo{

    /*public Cachorro (double peso, int idade, int membros, String corPelo){
        super(peso, idade, membros, corPelo);

    }*/

    /*@Override
    public void locomover(){
        System.out.println("Correndo muito rápido");
    }*/

    @Override
    public void emitirSom(){
        System.out.println("Au Au Au Au Grrrrr");
    }

    public void enterrarOsso(){
        System.out.println("Cavando para enterrar o osso.");
    }

    public void abanarRabo(){
        System.out.println("Abanando o rabo");
    }

    public void reagir(String frase){
        if (frase.equals("toma comida") || frase.equals("olá")){
            System.out.println("Abanar o rabo e latir");
        }else{
            System.out.println("Rosnar");
        }
        
    }

    public void reagir(int hora){
        if (hora < 12 ){
            System.out.println("Abanar o rabo");
        }else if(hora >= 18){
            System.out.println("Ignorar!");
        }else{
            System.out.println("Abanar o rabo e latir");
        }
        
    }

    public void reagir(Boolean dono){
        if (dono = true ){
            System.out.println("Abanar o rabo");
        }else{
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, double peso){
        if (idade <5){
            if(peso <10 ){
                System.out.println("Abanar o rabo");
            }else{
                System.out.println("Latir");
            }
        }else if(peso <10){
            System.out.println("Rosnar");
        }else{
            System.out.println("Ignorar");
        }
        
    }
    
}
