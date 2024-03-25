public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public boolean estaNoIntervalo(int inicio, int fim) {
        return valor >= inicio && valor <= fim;
    }
}
