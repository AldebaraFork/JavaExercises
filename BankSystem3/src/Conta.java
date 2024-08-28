import java.util.MissingFormatArgumentException;
import java.util.Scanner;

public abstract class Conta {

    //INSTANCIA DO SCANNER
    Scanner ler = new Scanner(System.in);

    private String nome;
    private int agencia;
    private String email;
    private int idade;

    //METODOS SET
    public void setNome(String nome) {
        try {
            System.out.println("Insira o nome: ");
            nome = ler.nextLine();
            if (nome.isBlank() || nome.isEmpty()) {
                System.out.println("Nome invalido! Tente novamente");
                setNome("");
            } else {
                System.out.println("Nome salvo com sucesso");
                this.nome = nome;
            }
        }catch (Exception e) {
            System.out.println("Ocorreu um erro! Tente novamente");
            System.out.println(e.getMessage());
            setNome(null);
        }
    }

    public void setAgencia(int agencia) {
        try {
            System.out.println("Insira o numero da agencia: ");
            agencia = ler.nextInt();
            if (agencia <= 0) {
                System.out.println("Agencia invalida! Tente novamente");
                setAgencia(0);
            }
        }catch (MissingFormatArgumentException e){
            System.out.println("Ocorreu o erro:  " + e.getMessage() + " Tente novamente");
            setAgencia(0);
        }
    }

    public void setEmail(String email) {
        try {
            System.out.println("Insira o email: ");
            email = ler.next();
            if (email.contains("@") && email.contains(".")) {
                System.out.println("Email validado com sucesso! ");
                this.email = email;
            } else {
                System.out.println("Email invalido! Tente novamente");
                setEmail(null);
            }
        }catch (MissingFormatArgumentException e){
            System.out.println("Ocorreu o erro:" + e.getMessage() + " Tente novamente");
            setEmail(null);
        }
    }

    public void setIdade(int idade) {
        try{
            System.out.println("Insira a idade: ");
            idade = ler.nextInt();
            if (idade < 18) {
                System.out.println("Idade invalida! Tente novamente");
                setIdade(0);
            }else {
                System.out.println("Idade salva! ");
                this.idade = idade;
            }
        }catch (MissingFormatArgumentException e){
            System.out.println("Ocorreu o erro:" + e.getMessage() + " Tente novamente");
            setIdade(0);
        }
    }


    //METODOS GET
    public String getNome() {
        return nome;
    }
    public int getAgencia() {
        return agencia;
    }
    public String getEmail() {
        return email;
    }
    public int getIdade() {
        return idade;
    }
}
