public class ContaFisica extends Conta implements ValidaSenha {

    //CONSTRUTOR DE CONTAS FISICAS, TODA CONTA FISICA DEVE POSSUIR NOME,EMAIL E IDADE
    public ContaFisica() {
        CriaContaFisica();
    }

    //PROPRIEDADES DA CONTA FISICA
    private String senha;
    private String cpf;

    //IMPLEMENTAÇÕES DA INTERFACE
    @Override
    public String getSenha() {
        return senha;
    }

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

    //VALIDA CASO A SENHA SEJA IGUAL A USADA NO setSenha
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


    //METODOS DO CPF
    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        try {
            System.out.println("Insira o CPF do usuario: ");
            cpf = ler.next();
            if (cpf.length() == 11) {
                System.out.println("Cpf cadastrado com sucesso! ");
                this.cpf = cpf;
            } else {
                System.out.println("CPF invalido! Tente novamente");
                setCpf("");
            }
        }catch (Exception e) {
            System.out.println("Ocorreu o erro " + e.getMessage() + ", Tente novamente");
            setCpf("");
        }
    }

    //ESSE METODO É TOTALMENTE OPCIONAL
    public void validaCpf(String cpf){
        try {
            System.out.println("Insira o cpf para validação: ");
            cpf = ler.next();
            if ((cpf.equals(this.cpf))) {
                System.out.println("Email validado com sucesso! ");
            }else {
                System.out.println("Tente novamente");
                setCpf("");
            }
        }catch (Exception e) {
            System.out.println("Ocorreu o erro " + e.getMessage() + ", Tente novamente");
            setCpf("");
        }

    }


   //ESSE METODO UTILIZA TODOS OS OUTROS PARA OBTER TODOS OS DADOS DE UMA CONTA FISICA
    public void CriaContaFisica(){
        try {
            setNome("");
            setEmail("");
            setIdade(0);
            setCpf("");
            setSenha("");

            //PEDE QUE O USUARIO INSIRA A SENHA ANTES DE TERMINAR DE CRIAR A CONTA
            validaSenha("");



            //AO OBTER TODOS OS DADOS EXIBE AO USUARIO
            System.out.println("Usuario criado com sucesso! ");
            System.out.println("================================");
            System.out.println("Nome: " + getNome() + " , Email: " + getEmail());
            System.out.println("Idade: " + getIdade() + ", CPF: " + getCpf());
            System.out.println("================================");
        }catch (Exception e) {
            System.out.println("Ocorreu o erro " + e.getMessage());
            CriaContaFisica();
        }

    }
}
