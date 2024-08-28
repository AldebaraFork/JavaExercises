public interface ValidaSenha {

    //AS CONTAS DEVEM POSSUIR UMA SENHA, SEJA FISICA OU JURIDICA
    public void setSenha(String senha);

    public void validaSenha(String senha);

    public String getSenha();
}
