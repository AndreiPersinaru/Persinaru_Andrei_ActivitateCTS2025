package RESTAURANT.B12.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ARestaurant implements Subject{
    private List<Observer> lista;
    private String nume;

    public ARestaurant(String nume) {
        this.nume = nume;
        lista = new ArrayList<>();
    }

    @Override
    public void adaugaObservator(Observer observer) {
        lista.add(observer);
    }

    @Override
    public void stergeObservator(Observer observer) {
        lista.remove(observer);
    }

    @Override
    public void notificaObservatori(String mesaj) {
        for(Observer observer : lista){
            observer.primesteMesaj(mesaj);
        }
    }

    public abstract void oferaDiscount(int discount);
}
