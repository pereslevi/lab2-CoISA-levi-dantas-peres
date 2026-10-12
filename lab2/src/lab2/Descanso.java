package lab2;

/**
 * Representa a rotina de descanço de um aluno.
 *
 * @author Levi Dantas Peres
 */
public class Descanso {
    private int horasDeDescanso;
    private int numeroSemanas;

    /**
     * Constrói a representação do descanso desse aluno.
     *
     */
    public Descanso() {
        this.horasDeDescanso = 0;
        this.numeroSemanas = 0;
    }

    /**
     *  Define a(s) hora(s) de descanso do aluno.
     *
     * @param horasDeDescanso a(s) hora(s) de descanso do aluno.
     */
    public void defineHorasDescanso(int horasDeDescanso) {

        this.horasDeDescanso = horasDeDescanso;
    }

    /**
     * Define o número de semanas com base no valor anterior.
     *
     * @param numeroSemanas o número de semana(s) a ser(em) definido(s).
     */
    public void defineNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

    /**
     *  Verifica o estado do aluno e o exibe.
     *
     * @return retorna "Desansado" quando a meta for atingida. enquanto retorna "Cansado" quando não for atingida.
     */
    public String getStatusGeral() {
        if (numeroSemanas > 0 && (horasDeDescanso / numeroSemanas) >= 26) {
            return "Descansado";
        } else {
            return "Cansado";
        }
    }

}