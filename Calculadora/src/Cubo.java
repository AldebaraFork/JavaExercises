public class Cubo extends Operacoes{

    public Cubo(){
        setPrimeiroNumero(0);
    }
    @Override
    public void calcular() {
        try{
            resultado = getPrimeiroNumero() * getPrimeiroNumero() * getPrimeiroNumero();
            System.out.println("Resultado ao quadrado: " + resultado);
        }catch (ArithmeticException e ){
            System.out.println("Ocorreu um erro durante o calculo! Tente novamente.");
            calcular();
        }
    }
}
