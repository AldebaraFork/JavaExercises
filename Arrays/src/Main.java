public class Main {
    public static void main(String[] args) {


        Joestar joestar = new Joestar();
        Stand stand = new Stand();
        Jojo jojo = new Jojo(stand, joestar);


        System.out.println(stand.toString());
        System.out.println(joestar.toString());


    }
}