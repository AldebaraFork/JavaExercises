public class Joestar {

    private String nomesJoestar;

    public Joestar(){
        setNomesJoestar("");
    }

    public void setNomesJoestar(String nomesJoestar) {
        nomesJoestar = "Jotaro Kujo";
        this.nomesJoestar = nomesJoestar;
    }

    public String getNomesJoestar(){
        return this.nomesJoestar;
    }


    @Override
    public String toString(){
        return "Nome do joestar: " + getNomesJoestar();
    }
}
