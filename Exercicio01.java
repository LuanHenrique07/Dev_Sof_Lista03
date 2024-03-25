public class Exercicio01 {
    public static void executar(){

        String nomeAluno = Prompt.lerLinha("Digite o nome do aluno: ");
        double nota1 = Prompt.lerDecimal("Digite a nota da prova 1: ");
        double nota2 = Prompt.lerDecimal("Digite a nota da prova 2:") ;
        double nota3 = Prompt.lerDecimal("Digite a nota da prova 3: ");
        
        // Cria um objeto Aluno com os dados informados
        Aluno aluno = new Aluno(nomeAluno, nota1, nota2, nota3);
        
        // Calcula a média aritmética
        double media = aluno.calcularMedia();

        // Exibe o nome do aluno e sua média
        Prompt.imprimir("Nome do aluno: " + aluno.getNome());
        System.out.printf("Média: %.2f\n", media);
    }
}
