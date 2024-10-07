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

    

    //SETTERS
    public void setPrimeiroNumero(double primeiroNumero){
        //evita com que os setters entrem em loop
        boolean entrada = false;
        while(!entrada) {
            try {
                System.out.println("Insira o primeiro numero: ");
                //define o valor do primeiro numero
                primeiroNumero = ler.nextDouble();
                entrada = true;
            } catch (InputMismatchException e) {
                //verifica caso o usuario não tenha inserido um numero
                System.out.println("Informe um numero! Tente novamenet");
            }
        }
        this.primeiroNumero = primeiroNumero;
        System.out.println("Numero inserido: " + getPrimeiroNumero());
    }


    public void setSegundoNumero(double segundoNumero){
         boolean entrada = false;
         while(!entrada) {
             try {
                 //define o valor do segundo numero
                 System.out.println("Insira o segundo numero: ");
                 segundoNumero = ler.nextDouble();
                 entrada = true;
             } catch (InputMismatchException e) {
                 System.out.println("Insira um numero! Tente novamente");
             }
         }
        this.segundoNumero = segundoNumero;
        System.out.println("Numero inserido: " + getSegundoNumero());
    }



    //metodo de calculo para todas as classes
    public abstract void calcular();

}
