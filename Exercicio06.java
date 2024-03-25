public class Exercicio06 {
    public static void executar(){
        double precoCusto = Prompt.lerDecimal("Digite o preço de custo do produto: ");
        double percentualAcrescimo = Prompt.lerDecimal("Digite o percentual de acréscimo (em %): ");
      
        Produto produto = new Produto(precoCusto);

        double valorVenda = produto.calcularValorVenda(percentualAcrescimo);

        System.out.printf("O valor de venda do produto é R$%.2f\n", valorVenda);
    }
}
