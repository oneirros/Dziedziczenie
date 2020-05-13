package dziedziczenie.main;

import dziedziczenie.potwory.Potwory;

public class Bartek extends Potwory {

    @Override
    protected void atak() {
        super.atak();
        System.out.println("Atakuje Bartek");
    }
}
