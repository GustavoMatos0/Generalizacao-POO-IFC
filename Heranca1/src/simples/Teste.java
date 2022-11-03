package simples;

public class Teste {

    public static void main(String[] args) {
        Conta c = new Conta("bradesco", 666, 6666, 2000);
        c.deposito(300);
        c.saque(1000);
        System.out.println(c);
    }
}