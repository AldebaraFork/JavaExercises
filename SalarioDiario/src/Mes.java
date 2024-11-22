import java.util.InputMismatchException;
import java.util.Scanner;

public class Mes {

    Scanner ler = new Scanner(System.in);

    //PROPRIEDADES
    private int mes;
    private int dia;



    //GET DIA
    public int getDia(){
        return this.dia;
    }


    //DEFINE O DIA BASEADO NO MES
    public void setMes(int mes) {
        try {
            System.out.println("Digite o numero do mês: ");
            mes = ler.nextInt();
            switch (mes) {
                case 1:
                    System.out.println("O mes selecionado foi janeiro! Com 31 dias");
                    dia = 31;
                    break;
                case 2:
                    System.out.println("O mes selecionado foi fevereiro! com 28 dias");
                    dia = 28;
                    break;
                case 3:
                    System.out.println("O mes selecionado foi março! com 31 dias");
                    dia = 31;
                    break;
                case 4:
                    System.out.println("O mes selecionado foi abril! com 30 dias");
                    dia = 30;
                    break;
                case 5:
                    System.out.println("O mes selecionado foi maio! com 31 dias");
                    dia = 31;
                    break;
                case 6:
                    System.out.println("O mes selecionado foi junho! com 30 dias");
                    dia = 30;
                    break;
                case 7:
                    System.out.println("O mes selecionado foi julho! com 31 dias");
                    dia = 31;
                    break;
                case 8:
                    System.out.println("O mes selecionado foi agosto! com 31 dias");
                    dia = 31;
                    break;
                case 9:
                    System.out.println("O mes selecionado foi setembro! com 30 dias");
                    dia = 30;
                    break;
                case 10:
                    System.out.println("O mes selecionado foi outubro! com 31 dias");
                    dia = 31;
                    break;
                case 11:
                    System.out.println("O mes selecionado foi novembro! com 30 dias");
                    dia = 30;
                    break;
                case 12:
                    System.out.println("O mes selecionado foi dezembro! com 31 dias");
                    dia = 31;
                    break;
                default:
                    System.out.println("Mês invalido tente novamente! ");
                    break;
            }

        } catch (InputMismatchException ex) {
            System.out.println("Insira um mes valido, codigo do erro: ");
            System.out.println(ex.getMessage());

        }
    }



}
