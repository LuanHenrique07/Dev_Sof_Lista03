public class Exercicio13 {
    public static void executar(){
        int totalAptos = 0;
        int totalInaptos = 0;

        int quantidadePessoas = Prompt.lerInteiro("Digite a quantidade de pessoas a serem verificadas: ");

        for (int i = 0; i < quantidadePessoas; i++) {
            Prompt.imprimir("Pessoa " + (i + 1));
            String nome = Prompt.lerLinha("Nome: ");
            String sexo = Prompt.lerLinha("Sexo (M/F): ");
            int idade = Prompt.lerInteiro("Idade: ");
            String saude = Prompt.lerLinha("Saúde (S/N): ");
            

            Militar pessoa = new Militar(nome, sexo, idade, saude);

            if (pessoa.estaApto()) {
                Prompt.imprimir("Está apto para o serviço militar obrigatório.");
                totalAptos++;
            } else {
                Prompt.imprimir("Não está apto para o serviço militar obrigatório.");
                totalInaptos++;
            }
        }

        Prompt.imprimir("Total de pessoas aptas: " + totalAptos);
        Prompt.imprimir("Total de pessoas inaptas: " + totalInaptos);
    }
}
