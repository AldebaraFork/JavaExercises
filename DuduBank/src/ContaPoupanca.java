public class ContaPoupanca extends Conta{

    @Override
    public void transferir(double valor, Conta destino) {
        //TAXA DE 80 CENTAVOS POR TRANSFERENCIA
        double novoValor = valor - 0.80;
        super.transferir(valor, destino);
    }
}
