import java.util.InputMismatchException;
import java.util.Scanner;

public abstract class Operacoes {

    //PROPRIEDADES DAS OPERAÇÕES
    private double primeiroNumero;
    private double segundoNumero;
    public double resultado;

    //Scanner
    Scanner ler = new Scanner(System.in);

    //GET NUMEROS
    public double getPrimeiroNumero(){
        return this.primeiroNumero;
    }
    public double getSegundoNumero(){
        return this.segundoNumero;
    }
    public double getResultado(){
        return this.resultado;
    }

    //SETTERS
    public void setPrimeiroNumero(double primeiroNumero){
        try {
            System.out.println("Insira o primeiro numero: ");
            //define o valor do primeiro numero
            primeiroNumero = ler.nextDouble();
            this.primeiroNumero = primeiroNumero;
            System.out.println("Numero inserido: " + getPrimeiroNumero());

        }catch (InputMismatchException e){
            //verifica caso o usuario não tenha inserido um numero
            System.out.println("Informe um numero! ");
            setPrimeiroNumero(0);
        }
    }
    public void setSegundoNumero(double segundoNumero){
        try{
            //define o valor do segundo numero
            System.out.println("Insira o segundo numero: ");
            segundoNumero = ler.nextDouble();
            this.segundoNumero = segundoNumero;
            System.out.println("Numero inserido: " + getSegundoNumero());

        }catch (InputMismatchException e){
            System.out.println("Insira um numero! ");
            setSegundoNumero(0);
        }
    }



    //metodo de calculo para todas as classes
    public abstract void calcular();

}
