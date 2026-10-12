package lab2;

/**
 * Representa um resumo composto por um tema e um conteúdo.
 *
 * @author Levi Dantas Peres
 */

public class Resumo {
    /**
    * Tema do resumo.
    */
    private String tema;

    /**
    * Conteúdo textual do resumo
    */
    private String conteudo;

    /**
     * Constrói um resumo com o tema e o conteúdo informados.
     *
     * @param tema tema do resumo.
     * @param conteudo conteúdo do resumo.
     */

    public Resumo(String tema, String conteudo){
        this.tema = tema;
        this.conteudo = conteudo;
    }

    /**
     * Retorna o tema do resumo.
     *
     * @return tema do resumo.
     */

    public String getTema(){
        return this.tema;
    }

    /**
     * Retorna o conteúdo do resumo.
     *
     * @return conteúdo do resumo.
     */

    public String getConteudo(){
        return this.conteudo;
    }
}