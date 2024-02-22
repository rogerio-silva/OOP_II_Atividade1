package src.main.java;

public class Professor extends Pessoa {
    int matricula;
    private String tipoContrato;
    private String curso;

    public Professor(int matricula, String tipoContrato, String curso) {
        this.matricula = matricula;
        this.tipoContrato = tipoContrato;
        this.curso = curso;
    }

    public Professor(String nome, int idade, double altura, int matricula, String tipoContrato, String curso) {
        super(nome, idade, altura);
        this.matricula = matricula;
        this.tipoContrato = tipoContrato;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Professor{" + super.toString() +
                ", matricula=" + matricula +
                ", tipoContrato='" + tipoContrato + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
