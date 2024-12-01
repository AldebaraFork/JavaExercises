public class Main {
    public static void main(String[] args) {


        ContaCorrente conta1 = new ContaCorrente(539,2353);
        ContaPoupanca conta2 = new ContaPoupanca(481, 2805);


        conta2.depositar(100);
        conta2.sacar(0);
        conta2.transferir(50, conta1);


        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getSaldo());
    }
}