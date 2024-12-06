package br.com.DuduBank.Model.Model;

public class ContaCorrente extends Conta {

    private String email;

    public ContaCorrente(int numero, int agencia, String email) {
        super(numero, agencia);
        this.email = email;
    }


    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "numero: " + getNumero()
                + ", agencia: " + getAgencia()
                 + ", email: " + getEmail();
    }
}
