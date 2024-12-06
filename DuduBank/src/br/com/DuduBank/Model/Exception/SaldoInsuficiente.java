package br.com.DuduBank.Model.Exception;

public class SaldoInsuficiente extends RuntimeException {
    public SaldoInsuficiente(String message) {
        super("Saldo Insuficiente! Tente realizar um depósito antes.");
    }
}
