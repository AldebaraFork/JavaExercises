public class Subtracao extends Operacoes{

    public Subtracao(){
        //obtem os numeros para a subtração
        setPrimeiroNumero(0);
        setSegundoNumero(0);
    }
    @Override
    public void calcular() {
            try {
                //calcula os numeros obtidos no construtor
                resultado = getPrimeiroNumero() - getSegundoNumero();
                System.out.println("Resultado da subtração: " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Erro ao calcular! Tente novamente");
                calcular();
            }

    }
}
