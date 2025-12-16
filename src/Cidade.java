public class Cidade {

    String estado;
    String nome;
    int populacao;
    int pontosTuristicos;

    public String getEstado() {
        return estado;
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public int getPontosTuristicos() {
        return pontosTuristicos;
    }

    public Cidade(String estado, String nome, int populacao, int pontosTuristicos){
        this.estado = estado;
        this.nome = nome;
        this.populacao = populacao;
        this.pontosTuristicos = pontosTuristicos;
    }
}
