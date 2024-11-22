public class Main {
    public static void main(String[] args) {
        Cliente teste = new Cliente("","","",0);

        System.out.println(teste.getNome());
        System.out.println(teste.getCpf());
        System.out.println(teste.getEmail());
        System.out.println(teste.getIdade());
    }
}