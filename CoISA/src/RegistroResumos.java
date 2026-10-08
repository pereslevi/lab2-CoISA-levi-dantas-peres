public class RegistroResumos {
    private Resumo[] resumos;
    private int pos;
    private String saidaTemas;
    private int quantidade;

    public RegistroResumos(int quantidade){
        this.quantidade += quantidade;
    }

    public void adiciona(String tema, String conteudo) {
        this.resumos[pos] = tema + conteudo;
    }

    public String[] pegaResumos() {
        return " ";
    }

    public String imprimeResumos() {
        return saidaTemas;
    }

    public int conta() {
        return 1;
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
