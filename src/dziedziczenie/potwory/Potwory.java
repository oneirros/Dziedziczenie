package dziedziczenie.potwory;

    public class Potwory {
    private double zycie ;
    private double level ;

     public Potwory(){
        zycie = 100;
        level = 100;
        System.out.println("Wywołano konstruktor domyślny dla Potwora");
    }

    protected Potwory(double zycie, double level){
        this.zycie = zycie;
        this.level = level;
        System.out.println("Wywołano konstruktor NIEdomyślny dla Potwora");
    }



    protected void atak(){

         System.out.println("Atakuje jako Potwór");
    }
}
