public class Main {
    public static void main(String[] args) {


        Conta conta = new Conta();

        conta.depositar(0);
        conta.sacar(0);
        System.out.println(conta.getSaldo());
    }
}