package RESTAURANT.B12.clase;

public class Client implements Observer{
    String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(nume + ", ai primit mesaj de la restaurant: " + mesaj);
    }
}
