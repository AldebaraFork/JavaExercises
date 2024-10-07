public class Multiplicacao extends Operacoes{

    //construtor da multiplicação
    public Multiplicacao(){
        //obtem os numeros diretamente do construtor
        setPrimeiroNumero(0);
        setSegundoNumero(0);
    }
    @Override
    public void calcular() {
        try {
            resultado = getPrimeiroNumero() * getSegundoNumero();
            System.out.println("Resultado da multiplicação " +  resultado);
        }catch (ArithmeticException e ){
            //caso ocorra algum erro de aritmetica
            System.out.println("Ocorreu um erro! Tente novamente ");
            calcular();
        }
    }
}
