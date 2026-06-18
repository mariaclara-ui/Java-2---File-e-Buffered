package File_e_Buffered.Nivel_3_Dificil.Entidades;

public class Desenvolvedor extends Participante{
    private String linguagemFavorita;

    public Desenvolvedor(String nome, Integer idade, String matricula, String linguagemFavorita) {
        super(nome, idade, matricula);
        this.linguagemFavorita = linguagemFavorita;
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
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setMatricula(String matricula) {
        super.setMatricula(matricula);
    }

    @Override
    public void setIdade(Integer idade) {
        super.setIdade(idade);
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String
    toString() {
        return "Desenvolvedor{" +
                "linguagemFavorita='" + linguagemFavorita + '\'' +
                '}';
    }
}
