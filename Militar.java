public class Militar {
    private String nome;
    private String sexo;
    private int idade;
    private String saude;

    public Militar(String nome, String sexo, int idade, String saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean estaApto() {
        // Verifica se atende aos critérios de aptidão para o serviço militar obrigatório
        return idade >= 18 && saude.equals("S");
    }
}
