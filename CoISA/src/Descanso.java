public class Descanso {
    private int horasDeDescanso;
    private int numeroSemanas;

    public Descanso() {
        this.horasDeDescanso = 0;
        this.numeroSemanas = 0;
    }

    public void defineHorasDescanso(int horasDeDescanso) {
        this.horasDeDescanso = horasDeDescanso;
    }

    public void defineNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

    public String getStatusGeral() {
        if (numeroSemanas == 0) {
            return "Cansado";
        } if ((horasDeDescanso / numeroSemanas) >= 26) {
            return "Descansado";
        } else {
            return "Cansado";
        }
    }

}