public class FluxoConexao implements AutoCloseable{

    public void IniciarConexao(){
        System.out.println("conexão iniciada ....");
        EstabelecerConexao();
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
