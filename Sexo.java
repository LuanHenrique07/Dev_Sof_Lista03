public class Sexo {
    private String descricao;

    public Sexo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public String toString() {
        return descricao.equals("M") ? "Homem" : "Mulher";
    }
}
