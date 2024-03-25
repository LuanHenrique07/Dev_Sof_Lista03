public class Vendedor {
    private String nome;
    private double salarioFixo;
    private double vendas;

    // Construtor da classe Vendedor
    public Vendedor(String nome, double salarioFixo, double vendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.vendas = vendas;
    }

    // Método para calcular o salário do vendedor no final do mês
    public double calcularSalarioFinal() {
        double comissao = vendas * 0.15; // 15% de comissão sobre as vendas
        return salarioFixo + comissao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }
}
