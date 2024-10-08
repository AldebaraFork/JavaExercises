import java.util.InputMismatchException;

public class JurosSimples extends Operacoes{

    //CONSTRUTOR
    public JurosSimples() {
        setPrimeiroNumero(0);
        setSegundoNumero(0);
        setTempo(0);
    }



    //PROPRIEDADES DA TAXA DE JUROS
    private double tempo;
    public void setTempo(double tempo){
        boolean entrada = false;
        while(!entrada) {
            try {

                System.out.println("Insira a quantidade de tempo em anos: ");
                tempo = ler.nextDouble();
                entrada = true;

            } catch (InputMismatchException e) {
                //verifica caso o usuario não tenha inserido um numero
                System.out.println("Informe um numero! Tente novamene");
            }
        }
        this.tempo = tempo;
    }
    public double getTempo(){
        return this.tempo;
    }


    @Override
    public void setPrimeiroNumero(double primeiroNumero) {
        System.out.println("Insira a capital inicial: ");
        super.setPrimeiroNumero(primeiroNumero);
    }

    @Override
    public void setSegundoNumero(double segundoNumero) {
        System.out.println("Insira a taxa de juros: ");
        super.setSegundoNumero(segundoNumero);
    }

    @Override
    public void calcular() {
        resultado = getPrimeiroNumero() * getSegundoNumero() * getTempo();
        System.out.println("Juros ao ano : " + resultado);
    }
}
