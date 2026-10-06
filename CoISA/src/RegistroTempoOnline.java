public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempo;

    public RegistroTempoOnline(String disciplina) {
        this.nomeDisciplina = disciplina;
        this.tempoOnlineEsperado = 120;
    }

    public RegistroTempoOnline(String disciplina, int tempoOnline) {
        this.nomeDisciplina = disciplina;
        this.tempoOnlineEsperado = tempoOnline;
    }


    public void adicionaTempoOnline(int tempo) {
        this.tempo += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        if (tempoOnlineEsperado <= tempo) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Nome Disciplina: " + nomeDisciplina + "\n" + "Tempo Realizado: " + tempo + "\n" + "Tempo Online Esperado: " + tempoOnlineEsperado;
    }


}
