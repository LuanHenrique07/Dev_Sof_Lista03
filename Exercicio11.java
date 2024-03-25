public class Exercicio11 {
    public static void executar(){
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < 56; i++) {
            String nome = Prompt.lerLinha("Digite o nome da pessoa " + (i + 1) + ": ");
            String sexoDesc = Prompt.lerLinha("Digite o sexo da pessoa " + (i + 1) + " (M/F): ");
            
            Sexo sexo = new Sexo(sexoDesc);

            Prompt.imprimir("Nome: " + nome + ", Sexo: " + sexo);
            
            if (sexo.getDescricao().equals("M")) {
                totalHomens++;
            } else {
                totalMulheres++;
            }
        }

        Prompt.imprimir("Total de homens: " + totalHomens);
        Prompt.imprimir("Total de mulheres: " + totalMulheres);

    }
}
