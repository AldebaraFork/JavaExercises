public class Divisao extends Operacoes{

    //construtor
    public Divisao(){
        //obtem os numeros
        setPrimeiroNumero(0);
        setSegundoNumero(0);
    }
    @Override
    public void calcular() {
        try {
            resultado = getPrimeiroNumero() / getSegundoNumero();
            System.out.println("Resultado da divisão: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Ocorreu um erro na divisão! Tente novamente");
            calcular();
        }
    }
}
