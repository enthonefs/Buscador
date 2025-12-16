public interface Repository {
    void adicionarCidade(String estado, String nome, int populacao, int pontosTuristicos);

    void listarCidades();
    void buscarPorNome(String nome);
    void comparar();
}
