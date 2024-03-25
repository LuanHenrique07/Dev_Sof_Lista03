public class Conversao {
    private double cotacaoDolar;

    // Construtor da classe Conversao
    public Conversao(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    // Método para calcular o valor em real a partir de um valor em dólar
    public double converterDolarParaReal(double quantidadeDolar) {
        return quantidadeDolar * cotacaoDolar;
    }

    // Getters e Setters
    public double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public void setCotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }
}
