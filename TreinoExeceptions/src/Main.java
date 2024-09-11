public class Main {
    public static void main(String[] args) {


        try(FluxoConexao fluxo = new FluxoConexao()){
            fluxo.IniciarConexao();
        }

    }
}