public class Joestar {

    private String nomesJoestar;

    public String getNomesJoestar(){
        return this.nomesJoestar;
    }


    @Override
    public String toString(){
        return "Nome do joestar: " + getNomesJoestar();
    }
}
