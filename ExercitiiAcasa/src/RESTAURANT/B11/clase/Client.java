package RESTAURANT.B11.clase;

public class Client{
    private IMetodaPlata metodaPlata;

    public Client() {
        metodaPlata = new PlataCard();
    }

    public void setMetodaPlata(IMetodaPlata iMetodaPlata) {
        this.metodaPlata = iMetodaPlata;
    }

    public void platesteNota(float pret) {
        metodaPlata.plateste(pret);
    }
}
