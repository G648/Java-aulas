import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> p = new ArrayList<>();

        p.add(new Livro("50 tons de cinza", 25.78, "Livros"));
        p.add(new Livro("50 tons de marrom", 50.00, "Livros"));
        p.add(new Livro("50 tons de vermelho", 100.00, "Livros"));
        p.add(new Eletronico("celular", 1500.00, "Eletronicos"));
        p.add(new Alimento("Arroz", 30.00, "Alimentos"));


        System.out.println("--- Lista de Produtos ---");

        for (Produto produto : p) {
            double precoFinal = produto.calcularDesconto();

            System.out.println("Produto: " + produto.getNomeProduto());
            System.out.println("Categoria: " + produto.getCategoriaProduto());
            System.out.println("Preço original: R$ " + produto.getPrecoProduto());
            System.out.println("Preço com desconto: R$ " + precoFinal);
            System.out.println("-------------------------");
        }
    }
}