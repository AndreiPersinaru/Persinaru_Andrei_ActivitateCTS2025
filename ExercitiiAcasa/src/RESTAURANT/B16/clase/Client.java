package RESTAURANT.B16.clase;

public class Client {
    private String nrTelefon;
    private String adresaMail;

    public Client(String nrTelefon, String adresaMail) {
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public String getAdresaMail() {
        return adresaMail;
    }
}
