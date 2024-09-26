public class Stand {

    private String star;

    public String getStar(){
        return this.star;
    }

    @Override
    public String toString(){
        return "Nome do stand: " + this.getStar();
    }
}
