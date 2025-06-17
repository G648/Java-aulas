public class Alimento extends Produto{
    private static final double DescontoAlimento = 0.98;

    public Alimento(String nomeProduto, double precoProduto, String categoriaProduto) {
        super(nomeProduto, precoProduto, categoriaProduto);
    }

    @Override
    public double calcularDesconto() {
        return getPrecoProduto() * DescontoAlimento;
    }
}
