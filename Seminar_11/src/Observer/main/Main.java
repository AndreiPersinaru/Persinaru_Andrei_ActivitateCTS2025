package Observer.main;

import Observer.clase.Autobuz;
import Observer.clase.Calator;
import Observer.clase.MijlocTransport;
import Observer.clase.IObserver;

public class Main {
    public static void main(String[] args) {
        IObserver calator1 = new Calator("calator1");
        IObserver calator2 = new Calator("calator2");
        IObserver calator3 = new Calator("calator3");

        MijlocTransport autobuz = new Autobuz(100);
        autobuz.adaugaObserver(calator1);
        autobuz.adaugaObserver(calator2);
        autobuz.adaugaObserver(calator3);
        autobuz.pleacaDeLaCapat();
        autobuz.stergeObserver(calator2);
        ((Autobuz)autobuz).schimbaTraseul();
    }
}