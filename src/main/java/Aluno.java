package src.main.java;

public class Aluno extends Pessoa {
    /* HERANÇA
    *  A herança é um princípio da POO que permite a criação de novas classes a partir
    *  de outras previamente criadas. Essas novas classes são chamadas de subclasses,
    *  ou classes derivadas; e as classes já existentes, que deram origem às subclasses,
    *  são chamadas de superclasses, ou classes base.
    *
    *  A classe Aluno Herda da classe Pessoa
    **/
    private int matricula;
    private String curso;

    public Aluno(int matricula, String curso) {
        this.matricula = matricula;
        this.curso = curso;
    }

    public Aluno(String nome, int idade, double altura, int matricula, String curso) {
        /* SUPER
        *  O super() invoca o construtor da classe base 'Pessoa'
        * */
        super(nome, idade, altura);
        this.matricula = matricula;
        this.curso = curso;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        /* SUPER
         *  O super.toString() invoca o método toString da classe base 'Pessoa'
         * */
        return "Aluno{" + super.toString() +
                ", matricula=" + matricula +
                ", curso='" + curso + '\'' +
                '}';
    }
}
