public class Exercicio12 {
    public static void executar(){
        int totalCarrosAte2000 = 0;
        int totalGeral = 0;

        while (true) {
            int ano = Prompt.lerInteiro("Digite o ano do carro: ");
            double valor = Prompt.lerDecimal("Digite o valor do carro: ");

            CarangoVelho carro = new CarangoVelho(ano, valor);

            Prompt.imprimir("Valor do desconto: " + carro.calcularDesconto());
            Prompt.imprimir("Valor a ser pago pelo cliente: " + carro.calcularValorFinal());

            if (ano <= 2000) {
                totalCarrosAte2000++;
            }
            totalGeral++;

            String continuar = Prompt.lerLinha("Deseja continuar calculando desconto? (S/N): ");
            if (continuar.equals("N")) {
                break;
            }
        }

        Prompt.imprimir("Total de carros até 2000: " + totalCarrosAte2000);
        Prompt.imprimir("Total geral: " + totalGeral);
    }
}
