public class Exercicio02 {
    public static void executar(){

        double distanciaPercorrida = Prompt.lerDecimal("Digite a distância total percorrida pelo automóvel (em km): ");
        double combustivelGasto = Prompt.lerDecimal("Digite o total de combustível gasto pelo automóvel (em litros): ");

        Automovel automovel = new Automovel(distanciaPercorrida, combustivelGasto);

        double consumoMedio = automovel.calcularConsumoMedio();

        // Exibe o consumo médio do automóvel
        System.out.printf("O consumo médio do automóvel é %.2f km/l\n", consumoMedio);
    }
}
