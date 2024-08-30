public class ContaJuridica extends Conta implements  ValidaSenha{


    //CONSTRUTOR
    public  ContaJuridica(){
        CriarContaJuridica();

    }

    //PROPRIEDADES DA CONTA JURIDICA
    private String cnpj;
    private String senha;
    private String razaoSocial;

    //METODOS GET
    public String getCnpj() {
        return this.cnpj;
    }
    public String getRazaoSocial(){
        return this.razaoSocial;
    }

    //METODOS SET
    public void setCnpj(String cnpj) {
        try {
            System.out.println("Insira o CNPJ para cadastro: ");
            cnpj = ler.next();
            if (cnpj.length() != 14) {
                System.out.println("CNPJ invalido! Tente novamente");
                setCnpj("");
            } else {
                System.out.println("CNPJ cadastrado com sucesso! ");
                this.cnpj = cnpj;
            }
        } catch (Exception e) {
            System.out.println("Ocorreu o erro: " + e.getMessage() + ", Tente novamente");
            setCnpj("");
        }
    }

    public void setRazaoSocial(String razaoSocial) {
        System.out.println("Insira a razao social: (nome da empresa)");
        razaoSocial = ler.next();
        if (razaoSocial.length() > 144 || razaoSocial.length() < 5) {
            System.out.println("Quantidade de caracteres invalida! ");
            setRazaoSocial("");
        }else {
            System.out.println("Salvo com sucesso!  ");
            this.razaoSocial = razaoSocial;
        }
    }




    //APARENTEMENTE INTERFACES NAO SÃO BOAS PARA REAPROVEITAMENTO DE CODIGO


    //METODOS DA INTERFACE
    @Override
    public void setSenha(String senha) {
        try {
            System.out.println("Insira a senha com no mínimo 8 caracteres: ");
            senha = ler.next();
            if (senha.length() < 8) {
                System.out.println("Senha invalida! Tente novamente");
                setSenha("");
            } else {
                System.out.println("Senha salva! ");
                this.senha = senha;

            }
        } catch (Exception e) {
            System.out.println("Ocorreu o erro " + e.getMessage() + "Tente novamente");
            setSenha("");
        }
    }

    @Override
    public void validaSenha(String senha) {
        try {
            System.out.println("Insira a senha para validação:");
            senha = ler.next ();
            if(senha.equals(this.senha)) {
                System.out.println("Senha validada com sucesso! ");
            }else {
                System.out.println("Senha incorreta Tente novamente");
                validaSenha("");
            }
        }catch (Exception e) {
            System.out.println("Ocorreu o erro: " +  e.getMessage());
            System.out.println("Causa: " + e.getCause() + ", Tente novamente");
        }
    }

    @Override
    public String getSenha() {
        return this.senha;
    }

    //ESSE METODO É PARA FACILITAR MINHA VIDA AO CRIAR UMA CONTA JURIDICA
    public void CriarContaJuridica(){
        try {

            //UTILIZA TODOS OS GETS
            setNome("");
            setEmail("");
            setCnpj("");
            setRazaoSocial("");
            setSenha("");
            setAgencia(0);
            setIdade(0);

            //Verifica a senha
            validaSenha("");

            //AO OBTER TODOS OS DADOS EXIBE AO USUARIO
            System.out.println("Usuario criado com sucesso! ");
            System.out.println("================================");
            System.out.println("Nome: " + getNome() + " , Email: " + getEmail());
            System.out.println("Idade: " + getIdade() + ", CPF: " + getCnpj());
            System.out.println("Nome da empresa: " + getRazaoSocial());
            System.out.println("================================");
        } catch (Exception e) {
            System.out.println("Ocorreu o erro " + e.getMessage());
            CriarContaJuridica();
        }
    }
}
