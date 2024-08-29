public class ContaFisica extends Conta implements ValidaSenha {

    //CONSTRUTOR DE CONTAS FISICAS, TODA CONTA FISICA DEVE POSSUIR NOME,EMAIL E IDADE
    public ContaFisica() {
        setNome("");
        setEmail("");
        setIdade(0);
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
          System.out.println("Insira a senha:");
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
            System.out.println("Insira o cpf: ");
            cpf = ler.next();
            if (cpf.length() != 11) {
                System.out.println("Cpf cadastrado com sucesso! ");
                this.cpf = cpf;
            } else {
                System.out.println("CPF invalido! Tente novamente");
            }
        }catch (Exception e) {
            System.out.println("Ocorreu o erro " + e.getMessage() + ", Tente novamente");
            setCpf("");
        }
    }

    //ESSE METODO É TOTALMENTE OPCIONAL
    public void validaCpf(String cpf){
        try {
            System.out.println("Insira o cpf: ");
            cpf = ler.next();
            if (cpf.length() != 11) {
                System.out.println("Insira um cpf valido! ");
                validaCpf("");
            }else if (cpf.equals(this.cpf)) {
                System.out.println("CPF validado com sucesso! ");

            }else {
                System.out.println("Tente novamente");
                setCpf("");
            }
        }catch (Exception e) {
            System.out.println("Ocorreu o erro " + e.getMessage() + ", Tente novamente");
            setCpf("");
        }

    }
}
