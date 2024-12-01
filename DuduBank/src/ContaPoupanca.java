public class ContaPoupanca extends Conta{

    public ContaPoupanca(int numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        //TAXA DE 80 CENTAVOS POR TRANSFERENCIA
        double novoValor = valor -0.80;
        super.transferir(novoValor, destino);
    }
}
