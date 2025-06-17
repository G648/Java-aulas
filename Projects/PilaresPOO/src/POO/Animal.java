
package POO;

public abstract class Animal {
    //atributos privados (Encapsulamento)
    private String nomeAnimal;
    private int idadeAnimal;
    
    //construtor 
    public Animal(String nome, int idade){ 
        this.nomeAnimal = nome;
        setIdadeAnimal(idade); //utilizar o setter como uma validação de dados
    }
    
    //Métodos getters (acesso controlado)
    public String getNomeAnimal() {
        return nomeAnimal;
    }
    
    public int getIdadeAnimal() {
        return idadeAnimal;
    }
    
    //Métodos setters
    public void setNomeAnimal(String nome){ 
        this.nomeAnimal = nome;
    }
    
    public void setIdadeAnimal(int idade) {
        if (idade <= 0) {
            System.out.println("Idade não pode ser menor ou igual a 0");
        } else {
            this.idadeAnimal = idade;
        }
    }
    
    //método abstrato (abstração)
    public abstract void fazerSom();
            
}
