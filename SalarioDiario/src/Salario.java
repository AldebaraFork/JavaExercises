import java.util.InputMismatchException;
import java.util.Scanner;

public class Salario {

    Scanner ler = new Scanner(System.in);
    Mes mes = new Mes();


    //PROPRIEDADES
    private double salarioTotal;

    //GET SALARIO
    public double getSalarioTotal() {
        return this.salarioTotal;
    }


    //OBTEM O SALRIO DO USUARIO
    public void setSalarioTotal (double Salario) {
        try {
            System.out.println("Insira o salario total: ");
            Salario = ler.nextDouble();
            if (salarioTotal <= 0){
                System.out.println("Salario salvo com sucesso!" );
                salarioTotal = Salario;
            }else {
                System.out.println("salario invalido! Tente novamente");
            }
        }catch (InputMismatchException exception){
            System.out.println("Insira um salario valido! ");
            setSalarioTotal(0);
        }
    }

    //CALCULA O GANHO DIARIO DO USUARIO BASEADO NA QUANTIDADE DE DIAS
    public void calculoSalarioDiario(){
        setSalarioTotal(0);
        mes.setMes(0);

        double salarioDiario = getSalarioTotal() / mes.getDia();

        System.out.println("Valor diário ganho de aproximadamente: " + salarioDiario);

    }
}
