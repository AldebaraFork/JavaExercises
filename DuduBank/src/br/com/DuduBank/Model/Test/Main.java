package br.com.DuduBank.Model.Test;

import br.com.DuduBank.Model.Model.ContaCorrente;
import br.com.DuduBank.Model.Model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {


        ContaCorrente conta = new ContaCorrente(123, 593, "eduardo@gmail.com");


        System.out.println(conta.toString());

    }
}