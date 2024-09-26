import java.util.ArrayList;

public class Jojo<T> {

    public ArrayList<T> jojos = new ArrayList<T>();

   public Jojo(T stande, T joestaar){
       Object stand = new Stand();
       Object joestar = new Joestar();
       adicionarListar(stande, joestaar);
   }
   public void adicionarListar(T stand, T joestar){
       jojos.add(stand);
       jojos.add(joestar);

   }




}
