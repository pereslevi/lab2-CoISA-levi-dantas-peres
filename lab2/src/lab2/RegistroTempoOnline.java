package lab2;

/**
 * Registra o tempo online dedicado pelo aluno a determinada disciplina e verifica se a meta foi atingida.
 *
 * @author Levi Dantas Peres
 */

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempo;

    /**
     * Cria um registro de tempo online com a meta padrão de 120.
     *
     * @param disciplina o nome da disciplina.
     */


    public RegistroTempoOnline(String disciplina) {
        this(disciplina, 120);
    }

    /**
     * Cria um registro de tempo online sem a meta padrão.
     *
     * @param disciplina o nome da disciplina.
     * @param meta o tempo online esperado.
     */

    public RegistroTempoOnline(String disciplina, int meta) {
        this.nomeDisciplina = disciplina;
        this.tempoOnlineEsperado = meta;
        this.tempo = 0;
    }

    /**
     * Adiciona uma quantidade de horas no total de tempo.
     *
     * @param horas o tempo a ser adicionado.
     */

    public void adicionaTempoOnline(int horas) {
        this.tempo += horas;
    }


    /**
     * Verifica se atingiu a meta.
     *
     * @return true se o tempo acumulado for igual ou superior a meta e false caso contrário.
     */

    public boolean atingiuMetaTempoOnline() {
        return tempo >= tempoOnlineEsperado;
    }

    /**
     * Retorna a representação textual do registro de tempo online.
     *
     * @return nome da disciplina, tempo acumulado e tempo online esperado.
     */

    @Override
    public String toString() {

        return nomeDisciplina + " " + tempo + "/" + tempoOnlineEsperado;
    }

}
