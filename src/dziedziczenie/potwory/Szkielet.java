package dziedziczenie.potwory;

public class Szkielet extends Potwory {

    public double obrona;

    public Szkielet(){
        System.out.println("Wywołano konstrukor domyślny");
    }


    public Szkielet(double zycie, double level){

        super(zycie,level);
        System.out.println("Wywołano konstrukor NIEdomyślny dla Szkieleta z dwoma argumentami");
    }


    public Szkielet(double zycie, double level, double obrona){

        super(zycie, level);
        this.obrona = obrona;
        System.out.println("Wywołano konstrukor NIEdomyślny dla Szkieleta");
    }

   /* @Override
    public void atak(){
        super.atak();
        System.out.println("Atakuje jak Szkielet");
    }*/

}
