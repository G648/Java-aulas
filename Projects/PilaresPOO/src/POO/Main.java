package POO;

public class Main {
    public static void main(String[] args) {
        //Criação do objeto da classe cachorro
        Animal cachorro = new Cachorro("Slink", 8, "Caramelo");
        
        //Criação do objeto da classe gato
        Animal gato = new Gato("Luke Skywalker", 1, "Vira-lata");
        
        
        //chamar os métodos através do polimorfismo
        cachorro.fazerSom(); //cachorro + nome + late
        gato.fazerSom(); //gato + nome + faz miau
        
//        System.out.println("teste");
    }
}
