package File_e_Buffered.Nivel_2_Medio.Entidades;

public class Atirador extends Personagem{
    private String armaPrincipal;

    public Atirador(String nome, Integer forcaBase, String armaPrincipal) {
        super(nome, forcaBase);
        this.armaPrincipal = armaPrincipal;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public Integer getForcaBase() {
        return super.getForcaBase();
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    @Override
    public void setForcaBase(Integer forcaBase) {
        super.setForcaBase(forcaBase);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    @Override
    public String toString() {
        return "Atirador{" +
                "armaPrincipal='" + armaPrincipal + "'";
    }
}
