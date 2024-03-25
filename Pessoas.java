public class Pessoas {
    private int idade;

    public Pessoas(int idade) {
        this.idade = idade;
    }

    public String verificarIdade() {
        if (idade >= 18) {
            return "Maior de idade";
        } else {
            return "Menor de idade";
        }
    }
}
