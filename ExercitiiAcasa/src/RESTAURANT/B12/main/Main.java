package RESTAURANT.B12.main;

import RESTAURANT.B12.clase.Client;
import RESTAURANT.B12.clase.Observer;
import RESTAURANT.B12.clase.Restaurant;


public class Main {
    public static void main(String[] args) {
        Observer client1 = new Client("client1");
        Observer client2 = new Client("client2");
        Observer client3 = new Client("client3");

        Restaurant restaurant = new Restaurant("Iladrino");
        restaurant.adaugaObservator(client1);
        restaurant.adaugaObservator(client2);
        restaurant.adaugaObservator(client3);
        restaurant.oferaDiscount(20);

        restaurant.stergeObservator(client2);
        restaurant.anuntaMeniuNou("Paste carbonara");
    }
}
