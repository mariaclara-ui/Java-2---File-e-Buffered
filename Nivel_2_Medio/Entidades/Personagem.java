package File_e_Buffered.Nivel_2_Medio.Entidades;

public class Personagem {
    private String nome;
    private Integer forcaBase;

    public Personagem(String nome, Integer forcaBase) {
        this.nome = nome;
        this.forcaBase=forcaBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getForcaBase() {
        return forcaBase;
    }

    public void setForcaBase(Integer forcaBase) {
        this.forcaBase = forcaBase;
    }

    @Override
    public String toString() {
        return "Nome='" + nome + '\'' +
                ", Força Base=" + forcaBase;
    }
}
