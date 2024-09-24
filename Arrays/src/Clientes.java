import java.util.Scanner;

public class Clientes {

    //Scanner
    Scanner ler = new Scanner(System.in);

    //ARRAY DE CLIENTES
    public static Clientes[] listaClientes = new Clientes[5];

    //PROPRIEDADES DE UM CLIENTE
    private String nome;
    private int idade;
    private String cpf;


    //GET  DOS CLIENTES
    public int getIdade() {
        return this.idade;
    }
    public String getNome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }


    //SET DOS CLIENTES

    public void setNome(String nome) {
        System.out.println("Digite o nome do cliente: ");
        nome = ler.nextLine();
        if(nome.isEmpty() || nome.isBlank()){
            System.out.println("Nome invalido! tente novamente");
            setNome("");
        }else {
            System.out.println("Nome: " + nome +  " ,salvo com sucesso!");
            this.nome = nome;
        }
    }

    public void setIdade(int idade) {
        System.out.println("Digite a idade do cliente: ");
        idade = ler.nextInt();
        if(idade < 18){
            System.out.println("Menor de idade! Tente novamente");
            setIdade(0);
        }else {
            System.out.println("Idade salva com sucesso! O usuario é maior de idade");
            this.idade = idade;
        }
    }

    public void setCpf(String cpf) {
        System.out.println("Insira o cpf do cliente: ");
        cpf = ler.nextLine();
        if(cpf.length() != 11){
            System.out.println("CPF invalido! Tente novamente");
            setCpf("");
        }else {
            System.out.println("CPF: " + cpf +  " ,salvo com sucesso!");
            this.cpf = cpf;
        }
    }

    //METODO PARA SALVAR UM CLIENTE NA LISTA

    public void salvarCliente(){
        Clientes cliente = new Clientes();
        cliente.nome = getNome();
        cliente.idade = getIdade();
        cliente.cpf = getCpf();
        System.out.println("Deseja salvar o cliente na lista? S/N");
        String resposta = ler.next();
        if(resposta.equalsIgnoreCase("sim") || resposta.equalsIgnoreCase("s")){
            for (int i = 0; i < listaClientes.length; i++) {
                listaClientes[i] = cliente;
                System.out.println("Cliente salvo com sucesso! ");
            }
        }else if (resposta.equalsIgnoreCase("nao") || resposta.equalsIgnoreCase("n")){
            System.out.println("Cliente não salvo! ");
            System.exit(0);
        }else {
            System.out.println("Opção invalida! Tente novamente");
            salvarCliente();
        }
    }

    public void visualizarCliente(){
        System.out.println("Lista de clientes: ");
        for (int i = 0; i < listaClientes.length; i++) {
            System.out.println("----------------------------------");
            System.out.println(listaClientes[i].getNome());
            System.out.println(listaClientes[i].getIdade());
            System.out.println(listaClientes[i].getCpf());

        }
    }
}
