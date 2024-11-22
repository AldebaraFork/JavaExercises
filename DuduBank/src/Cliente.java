import java.util.InputMismatchException;
import java.util.Scanner;

public class Cliente {

    Scanner ler = new Scanner(System.in);

    //PROPRIEDADES
    private String nome;
    private String cpf;
    private String email;
    private int idade;

    //CONSTRUTOR
    public Cliente(String nome, String cpf, String email, int idade) {
        setNome(nome);
        setCpf(cpf);
        setEmail(email);
        setIdade(idade);
    }

    //GETTERS
    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEmail(){
        return this.email;
    }

    public int getIdade(){
        return this.idade;
    }

    //SETTERS
    public void setNome(String nome){
        System.out.println("Insira o nome do cliente: ");
        nome = ler.nextLine();
        //VERIFICA CASO O NOME DO USUARIO ESTEJA EM BRANCO
        if (nome.isEmpty() || nome.isBlank()){
            System.out.println("Insira um nome valido! ");
            setNome(null);
        }else {
            System.out.println("Nome salvo com sucesso! ");
            this.nome = nome;
        }
    }

    public void setCpf(String cpf){
        System.out.println("Insira o CPF do cliente: ");
        cpf = ler.nextLine();
        if (cpf.length() != 11){
            System.out.println("CPF invalido! Tente novamente");
            setCpf(null);
        }else {
            System.out.println("CPF salvo com sucesso! ");
            this.cpf = cpf;
        }
    }

    public void setEmail(String email){
        System.out.println("Insira o email do cliente: ");
        email = ler.nextLine();
        if (email.contains("@") && email.contains(".")){
            System.out.println("Email cadastrado com sucesso! ");
            this.email = email;
        }else {
            System.out.println("Email invalido! Tente novamente");
            setEmail(null);
        }
    }

    public void setIdade(int idade){
        try{
            System.out.println("Insira o idade do cliente: ");
            idade = ler.nextInt();
            if (idade < 18){
                System.out.println("Idade negativo! Tente novamente");
                setIdade(0);
            }else {
                System.out.println("Idade salva! ");
                this.idade = idade;
            }
        }catch (InputMismatchException e){
            System.out.println("Insira a idade! Tente novamente");
            setIdade(0);
        }
    }
}
