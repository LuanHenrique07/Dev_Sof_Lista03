public class Automovel {
    private double distanciaPercorrida;
    private double combustivelGasto;

    // Construtor da classe Automovel
    public Automovel(double distanciaPercorrida, double combustivelGasto) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    // Método para calcular o consumo médio do automóvel
    public double calcularConsumoMedio() {
        return distanciaPercorrida / combustivelGasto;
    }

    // Getters e Setters
    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }
}
