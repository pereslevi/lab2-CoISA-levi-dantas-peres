package lab2;

import java.util.Arrays;

/**
 * Gerencia um conjunto de resumos, podendo adicionar, consultar, contar e pesquisar os resumos cadastrados.
 *
 * @author Levi Dantas Peres
 */

public class RegistroResumos {
    /**
     * Array que armazena os resumos.
     */
    private Resumo[] resumos;
    /**
     * Quantidade máximo de resumos.
     */
    private int numeroDeResumos;
    /**
     * Índice utilizado para a próxima inserção.
     */
    private int prox;

    /**
     * Constrói um registro de resumos com a capacidade informada.
     *
     * @param numeroDeResumos capacidade máxima de resumos.
     */

    public RegistroResumos(int numeroDeResumos){
        this.numeroDeResumos = numeroDeResumos;
        this.resumos = new Resumo[numeroDeResumos];
        this.prox = 0;
    }

    /**
     * Adiciona um resumo caso ainda não exista outro de mesmo tema.
     *
     * @param tema tema do resumo.
     * @param conteudo conteúdo do resumo.
     */

    public void adiciona(String tema, String conteudo) {
        if (! temResumo(tema)) {
            resumos[prox % this.resumos.length] = new Resumo(tema, conteudo);
            prox++;
        }
    }

    /**
     * Retorna os resumos cadastrados no formato "tema: conteúdo".
     *
     * @return Array de strings contendo os resumos.
     */

    public String[] pegaResumos() {
        String[] resultado = new String[conta()];

        int j = 0;
        for (int i = 0; i < numeroDeResumos ; i++) {
            if (resumos[j] != null) {
                resultado[j] = resumos[i].getTema() + ": " + resumos[i].getConteudo();
                j++;
            }
        }

        return resultado;
    }

    /**
     * Cria uma representação textual com a quantidade de resumos e os temas cadastrados.
     *
     * @return string com a quantidade de resumos e temas.
     */

    public String imprimeResumos() {
        String saida = "- " + conta() + " resumo(s) cadastrado(s)\n- ";

        for (int i = 0; i < prox; i++) {
            saida += resumos[i].getTema();
            if (i < prox - 1) {
                saida += " | ";
            }
        }

        return saida;
    }

    /**
     * Conta quantas posições do array estão ocupadas.
     *
     * @return quantidade de resumos armazenados.
     */

    public int conta() {
        int contador = 0;

        for (int i = 0; i < numeroDeResumos; i++) {
            if (!(resumos[i] == null)) {
                contador++;
            }
        }

        return contador;
    }

    /**
     * Verifica se já existe um resumo com o tema informado.
     *
     * @param tema tema a ser pesquisado.
     * @return true se o tema já estiver cadastrado, false caso contrário.
     */

    public boolean temResumo(String tema) {
        for (int i = 0; i < numeroDeResumos; i++) {
            if (! (resumos[i] == null) && (resumos[i].getTema().equals(tema))) {
                return true;
            }
        }
        return false;
    }

    /**
     * Pesquisa os resumos cujo conteúdo contém a palavra-chave.
     * A pesquisa independe de letras maiúsculas e minúsculas.
     *
     * @param chave palavra-chave a ser pesquisada.
     * @return array com os temas encontrados, em ordem alfabética.
     */

    public String[] busca(String chave) {
        String key = chave.toLowerCase();
        String[] encontrados = new String[prox];
        int cont = 0;

        for (int i = 0;i < prox;i++) {
            if (resumos[i].getConteudo().toLowerCase().contains(key)) {
                encontrados[cont] = resumos[i].getTema();
                cont++;
            }
        }

        encontrados = Arrays.copyOf(encontrados,cont);
        Arrays.sort(encontrados);
        return encontrados;
    }
}
