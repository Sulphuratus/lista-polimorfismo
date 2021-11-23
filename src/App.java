
import br.edu.iftm.herancapoli.Mamifero;
import br.edu.iftm.herancapoli.Reptil;
import br.edu.iftm.herancapoli.Tartaruga;
import br.edu.iftm.herancapoli.Peixe;
import br.edu.iftm.herancapoli.Arara;
import br.edu.iftm.herancapoli.Ave;
import br.edu.iftm.herancapoli.Cachorro;
import br.edu.iftm.herancapoli.Canguru;
import br.edu.iftm.herancapoli.Cobra;
import br.edu.iftm.herancapoli.Goldfish;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*Mamifero m = new Mamifero(102.5, 3, 2, "Marrom");
        Reptil r = new Reptil(2.5, 2, 0, "Cinza");
        Peixe p =  new Peixe(5.2, 1, 0, "Verde");
        Ave a = new Ave(4.5, 3, 4, "Azul");
        Cachorro c = new Cachorro(5.6, 8, 4, "Bege");
        Canguru k = new Canguru(20, 6, 4, "Marrom escuro");*/


        /*Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p =  new Peixe();
        Ave a = new Ave();*/

        Cachorro c = new Cachorro();
        /*Canguru k = new Canguru();

        Cobra q = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara u = new Arara();*/

        c.reagir("olá");
        c.reagir("vai ficar de castigo");
        c.reagir(10, 39);
        c.reagir(3, 11);

//System.out.println("Peso do mamífero: " + m.getPeso());        
/*m.setPeso(90.2);
m.locomover();
m.alimentar();

System.out.println();
c.locomover(); // método de mesma assinatura = sobreposição 
k.locomover();

System.out.println();
c.alimentar();
k.alimentar();

System.out.println();
c.emitirSom();
k.emitirSom();

a.alimentar();
a.emitirSom();
p.alimentar();
p.emitirSom();

q.alimentar();
g.emitirSom();
t.alimentar();
u.emitirSom();

p.setPeso(2.5);
r.setCorEscama("Verde");
m.setIdade(6);

System.out.println("Peso do Peixe: "+ p.getPeso());
System.out.println("Cor da escama do réptil:"+ r.getCorEscama());
System.out.println("Idade do Mamífero: " + m.getIdade());
System.out.println("Peso atualizado do mamífero: " + m.getPeso());*/


    }
}
