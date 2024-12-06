package br.com.DuduBank.Model.Model;


import br.com.DuduBank.Model.Exception.SaldoInsuficiente;

import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Conta {

    //PROPRIEDADES
    Cliente titular;
    private int agencia;
    private int numero;
    private double saldo;
    private boolean ativa = true;

    Scanner ler = new Scanner(System.in);
    Cliente cliente = new Cliente("eduardo", "41291732861", "edu@gmail.com", 20);


    public Conta(int numero, int agencia) {
        this.titular = cliente;
        this.agencia = agencia;
        this.numero = numero;
    }


    //GETTERS

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    //SETTERS

    public void setAgencia(int agencia) {
        try {
            System.out.println("Insira a agencia: ");
            agencia = ler.nextInt();
            if (agencia > 0) {
                System.out.println("Agencia: " + agencia + " salva com sucesso");
                this.agencia = agencia;
            } else {
                System.out.println("Agencia invalida! tente novamente");
                setAgencia(0);
            }
        } catch (InputMismatchException e) {
            System.out.println("Insira um numero de agencia valido! ");
            setAgencia(0);
        }
    }

    public void setNumero(int numero) {
        try {
            System.out.println("Insira o numero da conta: ");
            numero = ler.nextInt();
            if (numero > 0) {
                System.out.println("Numero da conta: " + numero + " salvo com sucesso! ");
                this.numero = numero;
            } else {
                System.out.println("Numero invalido! tente novamente");
                setNumero(0);
            }
        } catch (InputMismatchException e) {
            System.out.println("Insira um numero de agencia valido! ");
            setNumero(0);
        }
    }

    public void depositar(double valor) {
        try {

            if (valor < 0) {
                throw new SaldoInsuficiente("Valor inválido para depósito.");
            } else {
                this.saldo += valor;
            }
        } catch (InputMismatchException | SaldoInsuficiente e ) {
            System.out.println("Insira um valor valido para deposito! ");
            depositar(0);
        }
    }

    public void sacar(double valor)  {
        try {
            System.out.println("Insira um valor para saque: ");
            valor = ler.nextDouble();
            if (valor > getSaldo()) {
                throw new SaldoInsuficiente("Saldo Insuficiente! Tente realizar um depósito antes.");

            } else {
                System.out.println("Saque de  R$:" + valor + " Autorizado! ");
                this.saldo -= valor;
            }
        } catch (InputMismatchException | SaldoInsuficiente e) {
            System.out.println("Insira um valor valido para saque! ");
            sacar(0);
        }
    }

    public void transferir(double valor, Conta destino) {

        try {
            System.out.println("Insira o valor para transferencia");
            valor = ler.nextDouble();
            if (valor <= 0) {
                throw new IllegalArgumentException("O valor da transferência deve ser maior que zero.");
            } else if (valor > this.saldo) {
                throw new SaldoInsuficiente("Saldo insuficiente para a transferência.");
            }

            if (!destino.ativa) {
                throw new IllegalStateException("br.com.DuduBank.br.com.DuduBank.Model.Model.Conta destino inativa.");
            }

            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência de R$" + valor + " realizada com sucesso.");
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido. Por favor, insira um número.");
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }


}
