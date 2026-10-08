public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double media;
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
        double soma = 0;
        int add = 0;
        for (int i = 4; i > 0 ; i--) {
            if (!(notas[i] == 0.0) && add <= 3) {
            soma += notas[i];
            add ++;
            }
        }

        this.media = soma/add;

        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + media + " " + notas;
    }

}
