import java.util.Scanner;

public class FluxoConexao implements AutoCloseable{

    Scanner ler = new Scanner(System.in);

    public void IniciarConexao(){
        System.out.println("Deseja iniciar a conexão? S/N");
        String opcao = ler.nextLine().toLowerCase();
        if(opcao.equals("s") || opcao.equals("sim")) {
            //INICIA A CONEXÃO
            System.out.println("conexão iniciada ....");
            try {
                EstabelecerConexao();
            }finally {
                System.out.println("Ler fechado");
                ler.close();
            }
        }else if (opcao.equals("n") || opcao.equals("nao")) {
            //NAO INICIA A CONEXÃO E SAI DO PROGRAMA
            System.out.println("Conexão não iniciada! ");
            System.exit(0);
        }else {
            System.out.println("Opção invalida, Tente novamente");
            IniciarConexao();
        }
    }

    public void EstabelecerConexao(){
        System.out.println("Estabelecendo Conexao.....");
        throw new MinhaException();
    }

    //IMPLEMENTAÇÃO DO CLOSE
    @Override
    public void close() {
        System.out.println("Fechando conexão");
    }

}
