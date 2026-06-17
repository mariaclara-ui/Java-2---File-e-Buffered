package File_e_Buffered.Nivel_2_Medio.Entidades;

public class LutadorCorpoACorpo extends Personagem {
    private  String arteMarcial;

    public LutadorCorpoACorpo(String nome, Integer forcaBase, String arteMarcial) {
        super(nome, forcaBase);
        this.arteMarcial = arteMarcial;
    }

    @Override
    public Integer getForcaBase() {
        return super.getForcaBase();
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    public String getArteMarcial() {
        return arteMarcial;
    }

    @Override
    public void setForcaBase(Integer forcaBase) {
        super.setForcaBase(forcaBase);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setArteMarcial(String arteMarcial) {
        this.arteMarcial = arteMarcial;
    }

    @Override
    public String toString() {
        return "LutadorCorpoACorpo{" +
                "arteMarcial='" + arteMarcial +"'" ;
    }
}

