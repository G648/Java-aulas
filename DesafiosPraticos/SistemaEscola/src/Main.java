import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> p = new ArrayList<>();

        p.add(new Aluno("Guilherme", 22, 2981736));
        p.add(new Professor("Juliano", 35, "Tecnologia"));
        p.add(new Diretor("Maria", 58, 20));

        for (Pessoa pessoa : p) {
            System.out.println(pessoa.Apresentar());
        }
    }
}