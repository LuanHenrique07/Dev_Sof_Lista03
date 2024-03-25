public class Exercicio08 {
    public static void executar(){
        String nome = Prompt.lerLinha("Digite o nome do aluno: ");
        

        double nota1 = Prompt.lerDecimal("Digite a nota da prova 1: ");
         

        double nota2 = Prompt.lerDecimal("Digite a nota da prova 2: ");
        

        double nota3 = Prompt.lerDecimal("Digite a nota da prova 3: ");
        

        Aluno08 aluno = new Aluno08(nome, nota1, nota2, nota3);

        double media = aluno.calcularMedia();

        String resul = aluno.determinarResul();

        Prompt.imprimir("Nome do aluno: " + aluno.getNome());
        System.out.printf("Média: %.2f\n", media);
        Prompt.imprimir("Resultado: " + resul);
    }
}
