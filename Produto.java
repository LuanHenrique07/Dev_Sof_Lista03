public class Produto {
    private double precoCusto;

    // Construtor da classe Produto
    public Produto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    // Método para calcular o valor de venda com base no percentual de acréscimo
    public double calcularValorVenda(double percentualAcrescimo) {
        return precoCusto * (1 + percentualAcrescimo / 100);
    }

    // Getters e Setters
    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }
}
