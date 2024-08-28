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

    @Override
    public void validaSenha(String senha) {
      try {
          System.out.println("Insira a senha:");
          senha = ler.next();
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
}
