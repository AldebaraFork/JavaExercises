package br.com.DuduBank.Model.Test;

import br.com.DuduBank.Model.Model.ContaCorrente;
import br.com.DuduBank.Model.Model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {


        ContaPoupanca conta = new ContaPoupanca(123, 593);

        System.out.println(conta.toString());

    }
}