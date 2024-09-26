public class Stand {

    private String star;

    public Stand(){
        setStar("");
    }

    public void setStar(String star) {
        star = "Star platinum";
        this.star = star;
    }

    public String getStar(){
        return this.star;
    }

    @Override
    public String toString(){
        return "Nome do stand: " + this.getStar();
    }
}
