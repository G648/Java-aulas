public class Eletronico extends Produto{
    private static final double DescontoEletronico = 0.95;

    public Eletronico(String nomeProduto, double precoProduto, String categoriaProduto) {
        super(nomeProduto, precoProduto, categoriaProduto);
    }

    @Override
    public double calcularDesconto() {
        return getPrecoProduto() * DescontoEletronico;
    }
}
