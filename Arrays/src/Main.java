public class Main {
    public static void main(String[] args) {

        Clientes cliente = new Clientes();

        cliente.setNome("");
        cliente.setCpf("");
        cliente.setIdade(0);

        cliente.salvarCliente();
        cliente.visualizarCliente();
    }
}