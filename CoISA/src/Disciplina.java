public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String disciplina) {
        this.nomeDisciplina = disciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo = horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota] = valorNota;
    }

    public boolean aprovado() {

        int soma = 0;
        for (int i = 0; i < 4 ; i++) {
            soma += notas[i];
        }

        double media = soma/4;

        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return nomeDisciplina + "\n" + "Horas de Estudo: " + horasEstudo + "\n" + "Notas: " + notas;
    }

}
