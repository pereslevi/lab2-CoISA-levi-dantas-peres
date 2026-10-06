public class RegistroResumos {
    private Resumo[] resumos;
    private int pos;
    private String saidaTemas;
    private int numeroDeResumos;

    public RegistroResumos(int numeroDeResumos){
        this.resumos = new Resumo[numeroDeResumos] ;
        this.pos = 0;

    }

    public void adiciona(String tema, String conteudo) {
        this.resumos[pos % this.resumos.length] = new Resumo(tema, conteudo);

        pos++;
    }

    public String[] pegaResumos() {
        String[] tempResumos = new String[conta()];
        for (int i = 0; i < conta(); i++){
            tempResumos[i] = this.resumos[i].getTema() + ": " + this.resumos[i].getConteudo();
        }

        return tempResumos;
    }

    public String imprimeResumos() {
        String resultado = "";

        for (int i = 0; i < numeroDeResumos; i++) {
            for(int i = 0; i < pos; i++){
                if(i == 0){this.saidaTemas = this.resumos[i].getTema();}
                else{this.saidaTemas += " | " + this.resumos[i].getTema();}
            }
            return "- " + pos + " resumo(s) casdatrado(s) \n" + "- " + this.saidaTemas;
        }

        return resultado;
    }

    public int conta() {
        if(pos >= this.resumos.length){
            return this.resumos.length;
        } else {
            return pos;
        }

    }

    public boolean temResumo(String tema) {
        for(int i = 0; i < pos; i++){
            if(tema.equals(this.resumos[i].getTema())){
                return true;
            }
        }
        return false;
    }

}
