import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Administrador implements Repository{
    List<Cidade> cidades = new ArrayList<>();

    //ADICIONA UMA NOVA CIDADE
    public void adicionarCidade(String estado, String nome, int populacao, int pontosTuristicos){
        var cidade = new Cidade(estado, nome, populacao, pontosTuristicos);
        cidades.add(cidade);
    }
    //LISTA TODAS AS CIDADES
    public void listarCidades(){
        for (Cidade cidade : cidades){
            System.out.println("Estado: " + cidade.getEstado());
            System.out.println("Nome: " + cidade.getNome());
            System.out.println("População: " + cidade.getPopulacao());
            System.out.println("Pontos Turísticos: " + cidade.getPontosTuristicos());
            System.out.println("==========================");
        }

    }

    //BUSCA A CIDADE PELO NOME
    public void buscarPorNome(String nome){
        //REMOVE ESPAÇOS PARA BUSCA
        String nomeBusca = nome.trim().replaceAll("\\s+", "");
        boolean encontrado = false;

        for (Cidade cidade : cidades){
            String nomeCidade = cidade.getNome().trim().replaceAll("\\s+", "");

            //SE O PARÂMETRO FOR IGUAL AO NOME DA CIDADE
            if (nomeBusca.equalsIgnoreCase(nomeCidade)){
                System.out.println("Estado: " + cidade.getEstado());
                System.out.println("Nome: " + cidade.getNome());
                System.out.println("População: " + cidade.getPopulacao());
                System.out.println("Pontos Turísticos: " + cidade.getPontosTuristicos());
                System.out.println("==========================");
                encontrado = true;
            }
        }
        //SE NÃO FOR ENCONTRADO, RETORNE A EXCEPTION
        if (!encontrado){
            throw new RuntimeException("Cidade não encontrada");
        }
    }

    //COMPARAR QUAL CIDADE É MAIOR OU MENOR
    public void comparar(){
        //RECEBE A MAIOR CIDADE DE ACORDO COM A POPULAÇÃO
        Cidade cidadeMaior = cidades.stream()
                .max(Comparator.comparing(Cidade::getPopulacao))
                .orElse(null);

        //RECEBE A MENOR CIDADE DE ACORDO COM A POPULAÇÃO
        Cidade cidadeMenor = cidades.stream()
                .min(Comparator.comparing(Cidade::getPopulacao))
                .orElse(null);

        //SE A CIDADE NÃO ESTIVER VAZIA, RETORNE A MENSAGEM
        if (cidadeMaior != null) {
            System.out.printf("%s é a cidade mais populosa com %d habitantes.\n", cidadeMaior.getNome(), cidadeMaior.getPopulacao());
        }

        if (cidadeMenor != null){
            System.out.printf("%s é a cidade menos populosa com %d habitantes.", cidadeMenor.getNome(), cidadeMenor.getPopulacao());
        }
    }
}
