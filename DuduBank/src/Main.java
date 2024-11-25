public class Main {
    public static void main(String[] args) {


        Conta conta1 = new Conta();
        Conta conta2 = new Conta();


        conta2.setNumero(0);

        conta1.depositar(0);

        conta1.transferir(0, conta2);

        System.out.println(conta2.getSaldo());
        System.out.println(conta1.getSaldo());
    }
}