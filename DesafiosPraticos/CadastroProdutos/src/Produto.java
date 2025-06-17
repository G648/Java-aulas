public abstract class Produto {
    private String nomeProduto;
    private double precoProduto;
    private String categoriaProduto;

    public Produto(String nomeProduto, double precoProduto, String categoriaProduto) {
        this.nomeProduto = nomeProduto;
        setPrecoProduto(precoProduto);
        this.categoriaProduto = categoriaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public String getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        if (precoProduto < 0 ){
            throw new IllegalArgumentException("Não é possível cadastrar preço negativo");
        } else {
            this.precoProduto = precoProduto;
        }
    }

    public void setCategoriaProduto(String categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public abstract  double calcularDesconto();
}
