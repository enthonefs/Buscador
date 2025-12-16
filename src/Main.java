public class Main {
    public static void main(String[] args) {
        Administrador cidades = new Administrador();

        cidades.adicionarCidade("PE", "Pernambuco", 500000, 20);
        cidades.adicionarCidade("SP", "São Paulo", 11000000, 30);
        cidades.adicionarCidade("RJ", "Rio de Janeiro", 10500000, 50);
        cidades.buscarPorNome("São Paulo");
        cidades.listarCidades();
        cidades.comparar();

    }
}