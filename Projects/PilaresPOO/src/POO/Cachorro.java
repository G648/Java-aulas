package POO;

//pilar POO -> herança
//Classe cachorro está herdando de Animal
public class Cachorro extends Animal{
    private String corCachorro;
    
    
    public Cachorro(String nome, int idade, String cor){
        super(nome, idade); // Chamo o construtor utilizando a superclasse (Animal)
        this.corCachorro = cor;
    }
    
    //Implementação do método abstrato (Polimorfismo)
    @Override
    public void fazerSom() {
        System.out.println("O cachorro: " + getNomeAnimal() + " que tem a idade de: " + getIdadeAnimal() + " anos" + " esta latindo: Au Au");
    }
}
