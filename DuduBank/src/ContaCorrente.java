
public class ContaCorrente extends Conta{

    public ContaCorrente(int numero, int agencia) {
        super(numero, agencia);
    }

    @Override
    public String toString() {
        return "numero: " + getNumero()
                + ", agencia: " + getAgencia()
                 + ", titular: " + getTitular();
    }
}
