public class Main {
    public static void main(String[] args) {


        try(FluxoConexao fluxo = new FluxoConexao()){
            fluxo.IniciarConexao();
        }catch (MinhaException e){
            System.out.println("Catch iniciado! ");
            //MOSTRA AONDE OCORREU O ERRO
            e.printStackTrace();
        }


    }
}