package RESTAURANT.B12.clase;

public class Restaurant extends  ARestaurant{

    public Restaurant(String nume) {
        super(nume);
    }

    @Override
    public void oferaDiscount(int discount) {
        notificaObservatori("Azi ai discount de " + discount + "% la intregul meniu!!!");
    }

    public void anuntaMeniuNou(String produs){
        notificaObservatori("De azi gasesti " + produs + " in meniul nostru!");
    }
}
