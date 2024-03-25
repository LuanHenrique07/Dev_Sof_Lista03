public class Exercicio10 {
    public static void executar(){
        int quantidadePessoas = Prompt.lerInteiro("Quantas pessoas deseja verificar a idade? ");
         
            for (int i = 0; i < quantidadePessoas; i++) {
                int idade = Prompt.lerInteiro("Digite a idade da pessoa " + (i + 1) + ": ");
                Pessoas pessoa = new Pessoas(idade);
                Prompt.imprimir("Pessoa " + (i + 1) + ": " + pessoa.verificarIdade());
            }
    }
}
