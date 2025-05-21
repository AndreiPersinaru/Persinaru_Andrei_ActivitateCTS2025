package STB.F4.main;

import STB.F4.clase.AdapterTransport;
import STB.F4.clase.TransportSubteran;
import STB.F4.clase.TransportTerestru;

public class main {
    public static void valideazaBilet(TransportTerestru transportTerestru) {
        System.out.println("Se valideaza...");
        transportTerestru.validareBilet();
    }

    public static void main(String[] args) {
        TransportTerestru transportTerestru = new TransportTerestru();
        valideazaBilet(transportTerestru);
        TransportSubteran transportSubteran = new TransportSubteran();
        valideazaBilet(new AdapterTransport(transportSubteran));
    }
}
