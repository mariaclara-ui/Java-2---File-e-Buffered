package File_e_Buffered.Nivel_3_Dificil.Entidades;

public class Participante {
    private  String nome;
    private Integer idade;
    private String matricula;

    public Participante(String nome,Integer idade,String matricula) {
        this.nome = nome;
        setIdade(idade);
        this.matricula=matricula;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        if (idade<14|| idade>21){
            System.out.println("Idade Invalida");
            return;
        }
        this.idade=idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula='" + matricula + '\'' +
                '}';
    }
}
