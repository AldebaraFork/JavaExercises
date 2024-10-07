public class Soma extends Operacoes {

    public Soma(){
        //obtem os dois numeros para realizar a soma
        setPrimeiroNumero(0);
        setSegundoNumero(0);
    }

    @Override
    public void calcular() {
        try{
            resultado = getPrimeiroNumero() + getSegundoNumero();
            System.out.println("Resultado da soma: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Erro ao calcular! Calculando novamente");
            calcular();
        }
    }
}
