package File_e_Buffered.Nivel_1_facil.Entidades;

public class Musica {
    private String titilo;
    private String artista;
    private Integer anoLancamento;

    public Musica(String titilo, String artista,Integer anoLancamento) {
        this.titilo = titilo;
        this.artista=artista;
        this.anoLancamento=anoLancamento;
    }

    public String getTitilo() {
        return titilo;
    }

    public String getArtista() {
        return artista;
    }

    public Integer getAnoLancamento() {
        return anoLancamento;
    }

    public void setTitilo(String titilo) {
        this.titilo = titilo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAnoLancamento(Integer anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public String toString() {
        return "titilo = " + titilo + '\'' +
                ", artista = " + artista + '\'' +
                ", ano = " + anoLancamento;
    }
}
