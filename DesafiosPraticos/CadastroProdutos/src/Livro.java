public class Livro extends  Produto{
    private static final double DescontoLivro = 0.90;

    public Livro(String nomeProduto, double precoProduto, String categoriaProduto) {
        super(nomeProduto, precoProduto, categoriaProduto);
    }

    @Override
    public double calcularDesconto() {
        return getPrecoProduto() * DescontoLivro;
    }
}
