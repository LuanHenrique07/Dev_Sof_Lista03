public class Exercicio04 {
    public static void executar(){
        double cotacaoDolar = Prompt.lerDecimal("Digite a cotação do dólar (em reais por dólar): ");
        double quantidadeDolar = Prompt.lerDecimal("Digite a quantidade de dólares disponíveis: ");
       
        Conversao conversao = new Conversao(cotacaoDolar);

        double valorEmReal = conversao.converterDolarParaReal(quantidadeDolar);

        System.out.printf("O valor em real é R$%.2f\n", valorEmReal);

    }
}
