import java.util.InputMismatchException;
import java.util.Scanner;

public class Conta {

    //PROPRIEDADES
    Cliente titular;
    private int agencia;
    private int numero;
    private double saldo;

    Scanner ler = new Scanner(System.in);
    Cliente cliente = new Cliente("", "", "", 0);


    public Conta(){
        this.titular = cliente;
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
            System.out.println("Insira o valor para deposito: ");
            valor = ler.nextDouble();
            if (valor <= 0) {
                System.out.println("Valor invalido! Tente novamente");
                depositar(0);
            } else {
                System.out.println("Valor depositado com sucesso! ");
                this.saldo += valor;
            }
        } catch (InputMismatchException e) {
            System.out.println("Insira um valor valido para deposito! ");
            depositar(0);
        }
    }

    public void sacar(double valor) {
        try {
            System.out.println("Insira um valor para saque: ");
            valor = ler.nextDouble();
            if (valor > getSaldo()) {
                System.out.println("Valor para saque invalido! Não há dinheiro suficiente");
                sacar(0);
            } else {
                System.out.println("Saque de  R$:" + valor + " Autorizado! ");
                this.saldo -= valor;
            }
        }catch (InputMismatchException e) {
            System.out.println("Insira um valor valido para saque! ");
            sacar(0);
        }
    }
}
