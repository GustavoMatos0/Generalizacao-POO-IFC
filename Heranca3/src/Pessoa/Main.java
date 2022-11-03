package Pessoa;

public class Main {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Aluno a = new Aluno(32, 666, "Gustavo", "Rio do sul");
        Professor pr = new Professor("Matematica", 234, "Joao", "Lontras");
        System.out.println(p);
        System.out.println(a);
        System.out.println(pr);
    }

}
