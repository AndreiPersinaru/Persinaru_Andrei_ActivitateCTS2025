package RESTAURANT.B10.clase;

public class Client implements IClient{
    private String nume;
    private String numarTelefon;
    private String adresaMail;

    public Client(String nume, String numarTelefon, String adresaMail) {
        this.nume = nume;
        this.numarTelefon = numarTelefon;
        this.adresaMail = adresaMail;
    }

    @Override
    public void descriere(Rezervare rezervare) {
        System.out.println(nume + " cu " + numarTelefon + ", " + adresaMail + " a facut o rezervare: ");
        rezervare.descriereRezervare();
    }
}
