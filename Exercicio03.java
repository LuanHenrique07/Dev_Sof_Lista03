public class Exercicio03 {
    public static void executar(){
        String nome = Prompt.lerLinha("Digite o nome do vendedor: ");
        double salarioFixo = Prompt.lerDecimal("Digite o salário fixo do vendedor: ");
        double vendas = Prompt.lerDecimal("Digite o total de vendas efetuadas pelo vendedor (em dinheiro): ");

        Vendedor vendedor = new Vendedor(nome, salarioFixo, vendas);

        double salarioFinal = vendedor.calcularSalarioFinal();

        Prompt.imprimir("Nome do vendedor: " + vendedor.getNome());
        Prompt.imprimir("Salário fixo: R$" + vendedor.getSalarioFixo());
        System.out.printf("Salário no final do mês: R$%.2f\n", salarioFinal);
    }
}
