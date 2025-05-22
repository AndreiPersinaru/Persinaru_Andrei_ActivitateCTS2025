package RESTAURANT.B11.main;

import RESTAURANT.B11.clase.Client;
import RESTAURANT.B11.clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.platesteNota(120);
        client.setMetodaPlata(new PlataCash());
        client.platesteNota(99);
    }
}
