public class Exercicio07 {
    public static void executar(){
        double custoFabrica = Prompt.lerDecimal("Digite o custo de fábrica do carro: ");

        Carro carro = new Carro(custoFabrica);

        double custoConsumidor = carro.calcularCustoConsumidor();

        System.out.printf("O custo ao consumidor do carro é R$%.2f\n", custoConsumidor);

    }
}
