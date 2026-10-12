package lab2;

import java.util.Arrays;

/**
 * Representa o desempenho do aluno em uma disciplina.
 *
 * @author Levi Dantas Peres
 */

public class Disciplina {
    /**
     * Nome da disciplina.
     */
    private String nomeDisciplina;
    /**
     * Total de horas registradas.
     */
    private int horasEstudo;
    /**
     * Notas do aluno..
     */
    private double[] notas;
    /**
     * Média aritmética das notas do aluno..
     */
    private double media;

    /**
     * Constrói uma disciplina com todos os seus dados zerados.
     *
     * @param disciplina nome da disciplina.
     */


    public Disciplina(String disciplina) {
        this.nomeDisciplina = disciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
        this.media = 0.0;
    }

    /**
     * Adiciona horas ao total de horas de estudo.
     *
     * @param horas quantidade de horas a ser adicionada.
     */

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    /**
     * Cadastra uma nota na posição respectiva ao array.
     *
     * @param nota número ordinal da nota.
     * @param valorNota o valor da nota cadastrada.
     */

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota-1] = valorNota;
    }

    /**
     * Calcula a média aritmética das quatro notas e verifica se o aluno atingiu a média esperada.
     *
     *
     * @return true se igual ou acima de 7.0, false caso contrário.
     */

    public boolean aprovado() {

        double soma = 0;
        for (int i = 0; i < 4; i++) {
            soma += notas[i];
        }

        media = (double) soma / 4;

        return media >= 7.0;
    }

    @Override

    /**
     * Retorna a representação textual dos dados da disciplina.
     *
     * @return nome da disciplina, horas de estudo, media e as notas.
     */

    public String toString() {
        return nomeDisciplina + " "  + horasEstudo + " " + media + " " + Arrays.toString(notas);
    }

}
