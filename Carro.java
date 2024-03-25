public class Carro {
    private double custoFabrica;

    // Construtor da classe Carro
    public Carro(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    // Método para calcular o custo ao consumidor
    public double calcularCustoConsumidor() { 
        double impostos = custoFabrica * 0.45;
        
        double custoConsumidor = custoFabrica + impostos + (custoFabrica + impostos) * 0.28;
        
        return custoConsumidor;
    }

    // Getters e Setters
    public double getCustoFabrica() {
        return custoFabrica;
    }

    public void setCustoFabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }
}
