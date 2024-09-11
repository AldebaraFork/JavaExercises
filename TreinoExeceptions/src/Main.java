public class Main {
    public static void main(String[] args) {


        try(FluxoConexao fluxo = new FluxoConexao()){
            fluxo.IniciarConexao();
        }catch (Exception e){
            System.out.println("Catch inciado! ");
            //MOSTRA AONDE OCORREU O ERRO
            e.printStackTrace();
        }

    }
}