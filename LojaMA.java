public class LojaMA {
    private double valorCompra;

    // Construtor da classe LojaMA
    public LojaMA(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    // Método para calcular o valor das prestações
    public double calcularValorPrestacoes() {
        return valorCompra / 5;
    }

    // Getters e Setters
    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
}
