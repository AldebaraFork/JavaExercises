import java.util.ArrayList;

public class Jojo {

    public ArrayList<Object> jojos = new ArrayList<>();

   public Jojo(Stand stande, Joestar joestaar){
       adicionarListar(stande, joestaar);
   }
   public void adicionarListar(Object stand, Object joestar){
       jojos.add(stand);
       jojos.add(joestar);

   }




}
