

public class CarteiraInvestimentos extends Conta implements ValidaSenha{

    //PROPRIEDADES DE UMA CARTEIRA DE INVESTIMENTOS
    private String senha;
    private double saldo;
    private String Id;

    //CONSTRUTOR DA CARTEIRA
    public CarteiraInvestimentos(){

        //Toda carteira de investimento é necessario informar um ID e um saldo
        setId("");
        setSenha("");

        //Valida caso o usuario deseja realizar um deposito
        System.out.println("Deseja realizar um deposito? S/N");
        String resposta = ler.next();
        if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim")){
            deposito(0);
            setSaldo(0);
        }else if (resposta.equalsIgnoreCase("n") || resposta.equalsIgnoreCase("nao")){
            System.out.println("Deposito não realizado! ");
        }else {
            System.out.println("Insira uma opção valida! Não foi possivel criar uma carteira de investimento!");
        }
        //valida os dados ao usuario dentro do construtor
        validaId("");
        validaSenha("");


        //mostra os dados ao usuario

    }


    //METODOS DO ID
    public void setId(String id){
        System.out.println("Escolha seu ID: ");
        id = ler.next();
        if (id.isEmpty()){
            System.out.println("ID invalido! Tente novamente");
            setId("");
        }else {
            System.out.println("Id " + id + " Cadastrado com sucesso! ");
            this.Id = id;
        }
    }
    public String getId(){
        return this.Id;
    }
    public void validaId(String id){
        System.out.println("Insira o ID para validação:  ");
        id = ler.next();
        if(id.equalsIgnoreCase(this.Id)){
            System.out.println("Id validado com sucesso! ");
            //inserir metodo mais tarde
        }else {
            System.out.println("Id invalido! Tente novamente");
            validaId("");
        }
    }

    //METODOS DE SALDO
    public void deposito(double valor){
        System.out.println("Insira o valor do deposito: (minimo de 20 reais)");
        valor = ler.nextDouble();
        if (valor < 20){
            System.out.println("É necessario que o valor mínimo de depósito seja R$20!");
            deposito(0);
        }else {
            System.out.println("Depósito concluido!");
            //inserir metodo mais tarde
            setSaldo(valor);
        }
    }
    public void setSaldo(double valor){
        //por padrão todo saldo é 0
        this.saldo = valor;
        System.out.println("Seu saldo atual é de: " + getSaldo());

    }
    public double getSaldo(){
        return this.saldo;
    }



    //METODOS DA INTERFACE
    @Override
    public void setSenha(String senha) {
        System.out.println("Digite a senha da carteira de investimentos: ");
        senha = ler.next();
        //Caso a senha seja invalida
        if (senha.length() < 8) {
            System.out.println("Insira a senha novamente! Tente usar 8 caracteres");
            validaSenha(senha);
        }else {
            System.out.println("Senha valida! Salvando senha.");
            this.senha = senha;
        }
    }

    @Override
    public void validaSenha(String senha) {
        System.out.println("Digite a senha: ");
        senha = ler.next();
        if (senha.equals(getSenha())) {
            System.out.println("Senha validada Com sucesso!");
            //inserir metodo aqui mais tarde
        }else {
            //caso a senha não esteja correta
            System.out.println("Senha invalida! Tente novamente");
            validaSenha("");
        }
    }

    @Override
    public String getSenha() {
        return this.senha;
    }
}
