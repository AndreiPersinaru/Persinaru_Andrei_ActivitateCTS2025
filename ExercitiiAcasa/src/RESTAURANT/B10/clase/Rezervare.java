package RESTAURANT.B10.clase;

public class Rezervare {
    int nrMasa;
    int nrPersoane;
    String ora;

    public Rezervare(int nrMasa, int nrPersoane, String ora) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    public void descriereRezervare(){
        System.out.println("masa " + nrMasa + ", pentru " + nrPersoane + " persoane la ora " + ora);
    }
}
