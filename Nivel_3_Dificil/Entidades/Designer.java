package File_e_Buffered.Nivel_3_Dificil.Entidades;

public class Designer extends Participante {
    private String ferramentaVisual;

    public Designer(String nome, Integer idade, String matricula, String ferramentaVisual) {
        super(nome, idade, matricula);
        this.ferramentaVisual = ferramentaVisual;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public Integer getIdade() {
        return super.getIdade();
    }

    @Override
    public String getMatricula() {
        return super.getMatricula();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public void setIdade(Integer idade) {
        super.setIdade(idade);
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public String toString() {
        return "Designer{" +
                "ferramentaVisual='" + ferramentaVisual + '\'' +
                '}';
    }
}
