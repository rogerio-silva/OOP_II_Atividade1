package src.main.java;

public abstract class Pessoa {
    /* CLASSE ABSTRATA
    * Observem que a classe pessoa é abstrata, o que significa que ela não poderá
    *  ser instanciada. Os objetos serão criados apenas a partir de suas subclasses.
    * */

    /* ENCAPSULAMENTO
     *  Os atributos são todos privados, neste caso, os detalhes da classe serão todos escondidos.
     *  O acesso aos atributos se dará por meio dos métodos de Get e Set.
     * */

    private String nome;
    private int idade;
    private double altura;

    /* COSTRUTORES
     *  Os construtores são os responsáveis por criar o objeto em memória, ou seja,
     *  instanciar a classe que foi definida.
     *
     * POLIMORFISMO (Por sobrecarga)
     * A sobrecarga de métodos permite que vários métodos com o mesmo nome sejam definidos
     * na mesma classe. Eles devem ter diferentes tipos de parâmetros ou diferentes
     * quantidades de parâmetros. Isso permite que o mesmo método seja usado para diferentes
     * tipos de dados, tornando o código mais flexível e fácil de entender.
     * Ex: Polimorfismo nos métodos construtores, diferenciados pelos parâmetros de ambos
     * */

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
