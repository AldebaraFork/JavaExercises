package br.com.DuduBank.Model.Model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    public void transferir(double valor, Conta destino) {
        //TAXA DE 80 CENTAVOS POR TRANSFERENCIA
        double novoValor = valor -0.80;
        super.transferir(novoValor, destino);
    }

    @Override
    public String toString() {
        return "numero: " + getNumero()
                + ", agencia: " + getAgencia()
                + ", titular: " + getTitular();
    }
}
