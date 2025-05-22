package RESTAURANT.B8.clase;

public class Item implements Structura{
    private String nume;
    private float pret;

    public Item(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }


    @Override
    public void adaugaNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate adauga nimic aici.");
    }

    @Override
    public void stergeNod(Structura structura) throws Exception {
        throw new Exception("Nu se poate sterge nimic aici.");
    }

    @Override
    public Structura getNodCopil(int index) throws Exception {
        throw new Exception("Nu ai ce sa primesti de aici.");
    }

    @Override
    public void descriereStructura(String indent) {
        System.out.println(indent + nume + " ------ " + pret+ " RON");
    }
}
