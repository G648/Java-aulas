package POO;

public class Gato extends Animal {
    private String racaGato;

    public Gato(String nome, int idade, String raca) {
        super(nome, idade);
        this.racaGato = raca;
    }

    @Override
    public void fazerSom() {
        System.out.println("O gato: " + getNomeAnimal() + " esta miando: Miau!");
    }
    
}
