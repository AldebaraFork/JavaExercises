public class Media extends Operacoes{

    public Media(){
        setPrimeiroNumero(0);
        setSegundoNumero(0);
    }

    @Override
    public void calcular() {
        resultado = (getPrimeiroNumero() + getSegundoNumero()) / 2;
        System.out.println("A media dos valores é: " + resultado);

    }
}
