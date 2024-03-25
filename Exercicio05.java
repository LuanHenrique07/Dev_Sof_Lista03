public class Exercicio05 {
   public static void executar(){
        double valorCompra = Prompt.lerDecimal("Digite o valor da compra: ");

        LojaMA loja = new LojaMA(valorCompra);

        double valorPrestacoes = loja.calcularValorPrestacoes();

        System.out.printf("O valor das prestações é R$%.2f\n", valorPrestacoes);
   }
}
