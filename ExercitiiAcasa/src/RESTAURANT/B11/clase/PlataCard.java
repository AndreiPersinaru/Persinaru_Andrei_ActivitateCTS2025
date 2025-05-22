package RESTAURANT.B11.clase;

public class PlataCard implements IMetodaPlata{

    @Override
    public void plateste(float pret) {
        System.out.println("Ai platit cu cardul suma de " + pret + " RON.");
    }
}
