public class Quadrado extends Operacoes{

    public Quadrado(){
        setPrimeiroNumero(0);
    }
    @Override
    public void calcular() {
        try {
            resultado = getPrimeiroNumero() * getPrimeiroNumero();
            System.out.println("Numero dividido ao quadrado: " + resultado);
        }catch (ArithmeticException e){
            System.out.println("Ocorreu um erro na operação! Tente novamente");
            calcular();
        }
    }
}
