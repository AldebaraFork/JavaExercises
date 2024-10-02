import java.awt.*;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public class MenuPrincipal {

    Scanner ler = new Scanner(System.in);

    public void MenuPrincipal() {
        try {
            System.out.println("Bem vindo ao Banco do Dudu V3 ! Selecione uma opção abaixo :");
            System.out.println("1 - Criar conta fisica");
            System.out.println("2 - Criar conta juridica");
            System.out.println("3 - Criar carteira de investimentos ");
            System.out.println("4 - Menu de transações");
            System.out.println("5 - Sair");
            byte opcao = ler.nextByte();
            switch (opcao) {
                case 1:
                    //NO PROPRIO CONSTRUTOR JA EXECUTA OS METODOS NECESSARIOS PARA A CRIAÇÃO DA CONTA
                    ContaFisica contaFisica = new ContaFisica();
                    System.out.println("Conta criada com sucesso! ");
                    MenuPrincipal();
                    break;
                case 2:
                    ContaJuridica contaJuridica = new ContaJuridica();
                    System.out.println("Conta criada com sucesso! ");
                    MenuPrincipal();
                    break;
                case 3:
                    CarteiraInvestimentos investe = new CarteiraInvestimentos();
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Obrigado por usar meu sistema! ");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } catch (MissingFormatArgumentException e) {
            System.out.println("Ocorreu o erro: " + e.getMessage() + ", Tente novamente");
            MenuPrincipal();
        }
    }
}