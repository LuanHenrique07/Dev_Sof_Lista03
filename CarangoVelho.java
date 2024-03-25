public class CarangoVelho {
    private int ano;
    private double valor;

    public CarangoVelho(int ano, double valor) {
        this.ano = ano;
        this.valor = valor;
    }

    public double calcularDesconto() {
        if (ano <= 2000) {
            return valor * 0.12;
        } else {
            return valor * 0.07;
        }
    }

    public double calcularValorFinal() {
        return valor - calcularDesconto();
    }
}
