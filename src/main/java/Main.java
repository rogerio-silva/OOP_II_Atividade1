package src.main.java;

public class Main {
    public static void main(String[] args) {
        /* OBJETOS
        *  Os objetos p1 e p2 são instanciados das respectivas subclasses 'Aluno' e 'Professor'
        * */
        Pessoa p1 = new Aluno("José Inocêncio", 58, 1.76, 112110, "Tec.Info.Internet");
        Pessoa p2 = new Professor("Coronel Belarmino", 63, 1.73, 1001109, "DE", "Tec.Info.Internet");
        System.out.println(p1);
        System.out.println(p2);
    }
}
