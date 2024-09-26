public class Stand {

    public String star;

    public String getStar(){
        return this.star;
    }

    @Override
    public String toString(){
        return "Nome do stand: " + this.star;
    }
}
