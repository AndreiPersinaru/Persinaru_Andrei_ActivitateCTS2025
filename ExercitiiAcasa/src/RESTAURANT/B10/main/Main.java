package RESTAURANT.B10.main;

import RESTAURANT.B10.clase.Client;
import RESTAURANT.B10.clase.FlyweightRezervare;
import RESTAURANT.B10.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        FlyweightRezervare restaurant = new FlyweightRezervare();
        restaurant.getClient("Andrei", "07218458252", "adresaMail@yahoo.com");
        restaurant.getClient("Mihai", "07218452452", "adresaMail1@yahoo.com");
        restaurant.getClient("Eva", "07218452452", "adresaMail2@yahoo.com");

        Rezervare rezervare1 = new Rezervare(2, 4, "20:00");
        Rezervare rezervare2 = new Rezervare(1, 6, "21:00");

        restaurant.getClient("Andrei", "07218458252", "adresaMail@yahoo.com").descriere(rezervare1);
        restaurant.getClient("Mihai", "07218452452", "adresaMail1@yahoo.com").descriere(rezervare2);
        restaurant.getClient("Eva", "07218452452", "adresaMail2@yahoo.com").descriere(rezervare2);
    }
}
