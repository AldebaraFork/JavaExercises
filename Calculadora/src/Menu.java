import java.util.Scanner;

public class Menu {


    public void MenuPrincipal(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Bem vindo ao  menu! escolha sua opção abaixo");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("5 - Ao quadrado");
        System.out.println("6 - Ao cubo");
        System.out.println("0 - Sair");
        short resposta = ler.nextShort();
        switch(resposta){
            case 1:
                Soma soma = new Soma();
                soma.calcular();
                retornarMenuPrincipal();
                break;
            case 2:
                Subtracao sub = new Subtracao();
                sub.calcular();
                retornarMenuPrincipal();
                break;
            case 3:
                Multiplicacao mul = new Multiplicacao();
                mul.calcular();
                retornarMenuPrincipal();
                break;
            case 4:
                Divisao div = new Divisao();
                div.calcular();
                retornarMenuPrincipal();
                break;
            case 5:
                Quadrado quadrado = new Quadrado();
                quadrado.calcular();
                retornarMenuPrincipal();
                break;
            case 6:
                Cubo cubo = new Cubo();
                cubo.calcular();
                retornarMenuPrincipal();
                break;
            case 0:
                System.out.println("Obrigado por usar a calculadora! ");
                System.exit(0);
                break;
            default:
                System.out.println("Opção invalida! Tente novamente");
                MenuPrincipal();
                break;

        }
    }

    public void retornarMenuPrincipal(){
        System.out.println("Retornando ao menu principal....");
        MenuPrincipal();
    }
}
