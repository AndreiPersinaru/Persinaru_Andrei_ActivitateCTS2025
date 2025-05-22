package RESTAURANT.B11.clase;

public class PlataCash implements IMetodaPlata{

    @Override
    public void plateste(float pret) {
        System.out.println("Ai platit cash suma de " + pret + " RON.");
    }
}
