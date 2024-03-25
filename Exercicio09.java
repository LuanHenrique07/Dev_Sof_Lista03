public class Exercicio09 {
    public static void executar(){
        int numerosNoIntervalo = 0;

        Prompt.imprimir("Digite 80 números:");

        for (int i = 0; i < 80; i++) {
            int numero = Prompt.lerInteiro("Número " + (i + 1) + ": ");
            
            Numero num = new Numero(numero);

            if (num.estaNoIntervalo(10, 150)) {
                numerosNoIntervalo++;
            }
        }

        Prompt.imprimir("Total de números no intervalo entre 10 e 150 (inclusive): " + numerosNoIntervalo);
    }
}
